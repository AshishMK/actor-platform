package im.actor.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

import java.util.HashMap;

import im.actor.runtime.android.AndroidContext;
import im.actor.sdk.util.AndroidUtils;

/**
 * Created by 98379720172 on 09/03/17.
 */

public class ImageLruCache {

    private LruCache memCache;
    private HashMap<String, Integer> bitmapUseCounts = new HashMap<>();
    private String ignoreRemoval = null;

    public ImageLruCache() {

        int cacheSize = Math.min(15, ((ActivityManager) AndroidContext.getContext().getSystemService(Context.ACTIVITY_SERVICE)).getMemoryClass() / 7) * 1024 * 1024;

        memCache = new LruCache(cacheSize) {
            @Override
            protected int sizeOf(String key, BitmapDrawable value) {
                return value.getBitmap().getByteCount();
            }

            @Override
            protected void entryRemoved(boolean evicted, String key, final BitmapDrawable oldValue, BitmapDrawable newValue) {
                if (ignoreRemoval != null && key != null && ignoreRemoval.equals(key)) {
                    return;
                }
                final Integer count = bitmapUseCounts.get(key);
                if (count == null || count == 0) {
                    Bitmap b = oldValue.getBitmap();
                    if (!b.isRecycled()) {
                        b.recycle();
                    }
                }
            }
        };

    }


    private void performReplace(String oldKey, String newKey) {
        BitmapDrawable b = memCache.get(oldKey);
        if (b != null) {
            ignoreRemoval = oldKey;
            memCache.remove(oldKey);
            memCache.put(newKey, b);
            ignoreRemoval = null;
        }
        Integer val = bitmapUseCounts.get(oldKey);
        if (val != null) {
            bitmapUseCounts.put(newKey, val);
            bitmapUseCounts.remove(oldKey);
        }
    }

    private static volatile ImageLruCache Instance = null;

    public static ImageLruCache getInstance() {
        ImageLruCache localInstance = Instance;
        if (localInstance == null) {
            synchronized (ImageLruCache.class) {
                localInstance = Instance;
                if (localInstance == null) {
                    Instance = localInstance = new ImageLruCache();
                }
            }
        }
        return localInstance;
    }

    public void putImageToCache(BitmapDrawable bitmap, String key) {
        memCache.put(key, bitmap);
    }

    public BitmapDrawable getImageFromMemory(String key) {
        return memCache.get(key);
    }
}

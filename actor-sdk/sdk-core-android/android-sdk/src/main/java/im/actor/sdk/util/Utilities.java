package im.actor.sdk.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.nio.ByteBuffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import im.actor.runtime.Log;

/**
 * Created by 98379720172 on 06/01/17.
 */

public class Utilities {

    private static String TAG = Utilities.class.getName();

    public static Pattern pattern = Pattern.compile("[\\-0-9]+");
    public static volatile DispatchQueue globalQueue = new DispatchQueue("globalQueue");

    final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();

    public static Integer parseInt(String value) {
        if (value == null) {
            return 0;
        }
        Integer val = 0;
        try {
            Matcher matcher = pattern.matcher(value);
            if (matcher.find()) {
                String num = matcher.group(0);
                val = Integer.parseInt(num);
            }
        } catch (Exception e) {
            Log.e(TAG, e);
        }
        return val;
    }

    public static Long parseLong(String value) {
        if (value == null) {
            return 0L;
        }
        Long val = 0L;
        try {
            Matcher matcher = pattern.matcher(value);
            if (matcher.find()) {
                String num = matcher.group(0);
                val = Long.parseLong(num);
            }
        } catch (Exception e) {
           Log.e(TAG, e);
        }
        return val;
    }

    public static String parseIntToString(String value) {
        Matcher matcher = pattern.matcher(value);
        if (matcher.find()) {
            return matcher.group(0);
        }
        return null;
    }

    public static String bytesToHex(byte[] bytes) {
        if (bytes == null) {
            return "";
        }
        char[] hexChars = new char[bytes.length * 2];
        int v;
        for (int j = 0; j < bytes.length; j++) {
            v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }

    public static byte[] hexToBytes(String hex) {
        if (hex == null) {
            return null;
        }
        int len = hex.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4) + Character.digit(hex.charAt(i + 1), 16));
        }
        return data;
    }

    public static String MD5(String md5) {
        if (md5 == null) {
            return null;
        }
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuilder sb = new StringBuilder();
            for (int a = 0; a < array.length; a++) {
                sb.append(Integer.toHexString((array[a] & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            Log.e("tmessages", e);
        }
        return null;
    }

    public native static int pinBitmap(Bitmap bitmap);
    public native static void unpinBitmap(Bitmap bitmap);
    public native static void blurBitmap(Object bitmap, int radius, int unpin, int width, int height, int stride);
    public native static void calcCDT(ByteBuffer hsvBuffer, int width, int height, ByteBuffer buffer);
    public native static boolean loadWebpImage(Bitmap bitmap, ByteBuffer buffer, int len, BitmapFactory.Options options, boolean unpin);
    public native static int convertVideoFrame(ByteBuffer src, ByteBuffer dest, int destFormat, int width, int height, int padding, int swap);
    private native static void aesIgeEncryption(ByteBuffer buffer, byte[] key, byte[] iv, boolean encrypt, int offset, int length);
    public native static String readlink(String path);

}

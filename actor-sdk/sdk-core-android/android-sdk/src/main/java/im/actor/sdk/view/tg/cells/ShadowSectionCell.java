/*
 * This is the source code of Telegram for Android v. 3.x.x.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright Nikolai Kudashov, 2013-2016.
 */

package im.actor.sdk.view.tg.cells;

import android.content.Context;
import android.view.View;

import im.actor.sdk.R;
import im.actor.sdk.util.AndroidUtils;
import im.actor.sdk.util.Screen;


public class ShadowSectionCell extends View {

    private int size = 12;

    public ShadowSectionCell(Context context) {
        super(context);
        setBackgroundResource(R.drawable.greydivider);
    }

    public void setSize(int value) {
        size = value;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(widthMeasureSpec), MeasureSpec.EXACTLY), MeasureSpec.makeMeasureSpec(Screen.dp(size), MeasureSpec.EXACTLY));
    }
}

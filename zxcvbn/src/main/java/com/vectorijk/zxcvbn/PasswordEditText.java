package com.vectorijk.zxcvbn;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatEditText;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;

/**
 * Copyright (C) 2015 vectorijk <jiangkai@gmail.com>
 * Licensed under the MIT License.
 * http://opensource.org/licenses/MIT
 */

public class PasswordEditText extends AppCompatEditText {
    TextPaint textPaint = new TextPaint(Paint.ANTI_ALIAS_FLAG);
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    public PasswordEditText(Context context) {
        super(context);
        init(context, null);
    }

    public PasswordEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {

    }

    private static int dp2px(Context context, float dp) {
        Resources r = context.getResources();
        float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics());
        return Math.round(px);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        int startX = getScrollX();
        int endX = getWidth();
        int lineStartY = getScrollY() + getHeight();

        getPaint().setAlpha(255);
        paint.setColor(Color.RED);
        textPaint.setColor(Color.RED);
        canvas.drawText("draw Text", startX, endX, textPaint);
        canvas.drawRect(startX, lineStartY - dp2px(getContext(),2), endX, lineStartY , paint);
        super.onDraw(canvas);
    }
}
package com.customimageview.xiaosa.textimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.Log;

/**
 * 自定义带字的 ImageView
 * Created by 18848 on 2017/6/10.
 */

public class TextImageView extends AppCompatImageView {

    private String mText;
    private int textX = 0;
    private int textY = 0;
    private Paint mPaint;

    public TextImageView(Context context) {
        this(context, null);
    }

    public TextImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

     public TextImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.TextImageView);
        mText = typedArray.getString(R.styleable.TextImageView_text);
        textX = (int) typedArray.getDimension(R.styleable.TextImageView_textX, 10);
        textY = (int) typedArray.getDimension(R.styleable.TextImageView_textY, 10);
        mPaint = new Paint();
        mPaint.setColor(typedArray.getColor(R.styleable.TextImageView_textColor, Color.BLACK));
        mPaint.setTextSize(typedArray.getDimensionPixelSize(R.styleable.TextImageView_textSize, 25));
        mPaint.setStrokeWidth(30);
    }

    public void setTextColor(int color) {
        mPaint.setColor(color);
    }

    public void setText(String text) {
        this.mText = text;
    }

    public String getText() {
        return mText;
    }

    public void setTextSize(int textSize) {
        mPaint.setTextSize(textSize);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawText(mText, textX, textY, mPaint);
        /*Paint p = new Paint();
        p.setStrokeWidth(10);
        p.setColor(Color.BLACK);
        p.setTextSize(20);
        canvas.drawText("hello", 10, 10, p);*/
    }
}

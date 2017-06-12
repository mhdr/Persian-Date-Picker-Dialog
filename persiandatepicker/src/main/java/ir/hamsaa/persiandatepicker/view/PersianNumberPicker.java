package ir.hamsaa.persiandatepicker.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;

import java.lang.reflect.Field;

/**
 * Created by aliabdolahi on 1/23/17.
 */

public class PersianNumberPicker extends NumberPicker {

    private Typeface typeFace;

    public PersianNumberPicker(Context context) {
        super(context);
        this.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
    }

    public PersianNumberPicker(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
    }

    public PersianNumberPicker(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
    }

    @Override
    public void addView(View child) {
        super.addView(child);
        updateView(child);
    }

    @Override
    public void addView(View child, int index,
                        android.view.ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        updateView(child);
    }

    @Override
    public void addView(View child, android.view.ViewGroup.LayoutParams params) {
        super.addView(child, params);
        updateView(child);
    }

    public void setTypeFace(Typeface typeFace) {
        this.typeFace = typeFace;
        super.invalidate();
    }


    private void updateView(View view) {
        if (view instanceof EditText) {
            if (typeFace != null) {
                ((EditText) view).setTypeface(typeFace);
            }
        }
    }


}

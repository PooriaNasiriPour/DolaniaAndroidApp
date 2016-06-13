package egs.dolania.views;

import android.content.Context;
import android.graphics.Typeface;
import android.support.design.widget.TextInputLayout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.AttributeSet;

public class CTextInputLayout extends TextInputLayout {
    Context ctx;
    Typeface Tf;

    public CTextInputLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        ctx = context;
        init();
    }

    public CTextInputLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        ctx = context;
        init();
    }

    public CTextInputLayout(Context context) {
        super(context);
        ctx = context;
        init();
    }

    public void init() {
        setOnTouchListener(null);
        Tf = Typeface.createFromAsset(getContext().getAssets(), "sansbold.ttf");
        setTypeface(Tf);
    }

    public void setErrorCustom(String str) {
        SpannableString ss = new SpannableString(str);
        ss.setSpan(new FontSpan(Tf), 0, ss.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        setError(ss);
    }

    private static final class FontSpan extends MetricAffectingSpan {

        private final Typeface mNewFont;

        private FontSpan(Typeface newFont) {
            mNewFont = newFont;
        }

        @Override
        public void updateDrawState(TextPaint ds) {
            ds.setTypeface(mNewFont);
        }

        @Override
        public void updateMeasureState(TextPaint paint) {
            paint.setTypeface(mNewFont);
        }

    }
}
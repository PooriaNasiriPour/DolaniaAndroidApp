package egs.dolania.views;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import com.exon.payam.rekab.Help.GV;

public class CButton extends AppCompatButton {
    Context ctx;

    public CButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        ctx = context;
        init();
    }

    public CButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        ctx = context;
        init();
    }

    public CButton(Context context) {
        super(context);
        ctx = context;
        init();
    }

    public void init() {
        setOnTouchListener(null);
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), GV.FONT_SANS);
        setTypeface(tf);

    }
}
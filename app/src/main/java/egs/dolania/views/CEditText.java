package egs.dolania.views;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.Gravity;

import com.exon.rekab.Help.GV;
import com.exon.rekab.R;

public class CEditText extends AppCompatEditText {
    Context ctx;

    public CEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        ctx = context;
        init();
    }

    public CEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        ctx = context;
        init();
    }

    public CEditText(Context context) {
        super(context);
        ctx = context;
        init();
    }

    public void init() {

        setOnTouchListener(null);
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), GV.FONT_SANS);
        setTypeface(tf);

        int right = (int) getResources().getDimension(R.dimen.edit_text_padding_right);
        int left = (int) getResources().getDimension(R.dimen.edit_text_padding_left);
        int top = (int) getResources().getDimension(R.dimen.edit_text_padding_top);
        int bottom = (int) getResources().getDimension(R.dimen.edit_text_padding_bottom);

        setPadding(left, top, right, bottom);
        setGravity(Gravity.CENTER);
    }
}
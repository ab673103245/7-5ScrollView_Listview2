package qianfeng.a7_5scrollviewlistview2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by Administrator on 2016/10/12 0012.
 */
public class MyListView extends ListView {
    public MyListView(Context context) {
        super(context);
    }

    public MyListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        
        heightMeasureSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,MeasureSpec.AT_MOST);

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        // 实际上super.onMeasure()里面的heightMeasureSpec是调用getHeightSpec()来获得的，
        // 而这个getHeaightSpec是通过.makeMeasureSpec(高度，模式) 这个方法设置的高度和模式获取到的,只要高度设置的值足够大，模式是AT_MOST，就可以
    }
}

package cntt1_61133181.example.a61133181_bai119;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class iconAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<icon> iconList;

    public iconAdapter(Context context, int layout, List<icon> iconList) {
        this.context = context;
        this.layout = layout;
        this.iconList = iconList;
    }

    @Override
    public int getCount() {
        return iconList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);
        //ANH XA
        TextView tvthanhpho = (TextView) view.findViewById(R.id.tvthanhpho);
        ImageView img = (ImageView)  view.findViewById(R.id.img);
        //GAN GIA TRI
        tvthanhpho.setText(iconList.get(i).thanhPho);
        img.setImageResource(iconList.get(i).hinhAnh);
        return view;
    }
}

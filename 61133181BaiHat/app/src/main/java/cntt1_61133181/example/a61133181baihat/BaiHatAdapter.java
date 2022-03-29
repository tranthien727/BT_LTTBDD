package cntt1_61133181.example.a61133181baihat;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BaiHatAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<BaiHat> baiHatList;

    public BaiHatAdapter(Context context, int layout, List<BaiHat> baiHatList) {
        this.context = context;
        this.layout = layout;
        this.baiHatList = baiHatList;
    }

    @Override
    public int getCount() {
        return baiHatList.size();
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
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view =inflater.inflate(layout,null);

        TextView tvtenbaihat = (TextView) view.findViewById(R.id.tvtenbaihat);
        TextView tvtencasi = (TextView) view.findViewById(R.id.tvtencasi);
        ImageView img = (ImageView) view.findViewById(R.id.img);

        tvtenbaihat.setText(baiHatList.get(i).tenBaiHat);
        tvtencasi.setText(baiHatList.get(i).tenCaSi);
        img.setImageResource(baiHatList.get(i).hinhAnh);
        return view;
    }
}

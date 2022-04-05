package tranvietthien_baikt4.example.baikt4;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class animalsAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<animals> animalsList;

    public animalsAdapter(Context context, int layout, List<animals> animalsList) {
        this.context = context;
        this.layout = layout;
        this.animalsList = animalsList;
    }

    @Override
    public int getCount() {
        return animalsList.size();
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

        TextView tvanimals = (TextView) view.findViewById(R.id.tvanimals);
        TextView tvthongtin = (TextView) view.findViewById(R.id.tvthongtin);
        ImageView img =(ImageView) view.findViewById(R.id.img);

        tvanimals.setText(animalsList.get(i).tenAnimals);
        tvthongtin.setText(animalsList.get(i).thongTin);
        img.setImageResource(animalsList.get(i).hinhAnh);

        return view;
    }
}

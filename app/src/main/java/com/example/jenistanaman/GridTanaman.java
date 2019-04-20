package com.example.jenistanaman;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class GridTanaman extends RecyclerView.Adapter<GridTanaman.GridViewHolder> {

    private static final String TAG = "GridView";
    private ArrayList<String> imagenamaTanaman = new ArrayList<>();
    private ArrayList<String> ImageTanamans = new ArrayList<>();
    private ArrayList<String> ImageTanamansDesc = new ArrayList<>();
    private ArrayList<String> DeskripsiTanamanDetail = new ArrayList<>();

    private Context context;

    public GridTanaman(Context context, ArrayList<String> imagenamaTanaman, ArrayList<String> ImageTanamans, ArrayList<String> ImageTanamansDesc , ArrayList<String> DeskripsiTanamanDetail ) {

        this.imagenamaTanaman = imagenamaTanaman;
        this.ImageTanamans = ImageTanamans;
        this.ImageTanamansDesc = ImageTanamansDesc;
        this.DeskripsiTanamanDetail = DeskripsiTanamanDetail;
        this.context = context;

    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_tanaman, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, final int i) {
        Glide.with(context)
                .asBitmap()
                .load(ImageTanamans.get(i))
                .into(holder.imgPhoto);
        holder.imgPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"onClick: clicked on: "+ imagenamaTanaman.get(i));
                Toast.makeText(context, imagenamaTanaman.get(i),Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context, GalleryActivity.class);
                intent.putExtra("url_image",ImageTanamans.get(i));
                intent.putExtra("name_image",imagenamaTanaman.get(i));
                intent.putExtra("desc_image",DeskripsiTanamanDetail.get(i));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return ImageTanamans.size();
    }

    @Override
    public int getItemViewType(int position){
        return position;
    }

    class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}


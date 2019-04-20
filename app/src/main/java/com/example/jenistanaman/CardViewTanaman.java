package com.example.jenistanaman;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;



public class CardViewTanaman extends RecyclerView.Adapter<CardViewTanaman.ViewHolder> {

    private static final String TAG = "CardViewTanaman";

    private ArrayList<String> imagenamaTanaman = new ArrayList<>();
    private ArrayList<String> ImageTanamans = new ArrayList<>();
    private ArrayList<String> ImageTanamansDesc = new ArrayList<>();
    private ArrayList<String> DeskripsiTanamanDetail = new ArrayList<>();

    private Context context;

    public CardViewTanaman(Context context, ArrayList<String> imagenamaTanaman, ArrayList<String> ImageTanamans, ArrayList<String> ImageTanamansDesc , ArrayList<String> DeskripsiTanamanDetail ) {
        this.imagenamaTanaman = imagenamaTanaman;
        this.ImageTanamans = ImageTanamans;
        this.ImageTanamansDesc = ImageTanamansDesc;
        this.DeskripsiTanamanDetail = DeskripsiTanamanDetail;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_tanaman,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int i) {
        Log.d(TAG,"onBindViewHolder: called.");

        Glide.with(context)
                .asBitmap()
                .load(ImageTanamans.get(i))
                .into(holder.image);
        holder.imageName.setText(imagenamaTanaman.get(i));
        holder.ImageTanamansDesc.setText(ImageTanamansDesc.get(i));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
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
        holder.btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"onClick: clicked on: "+ imagenamaTanaman.get(i));
                Toast.makeText(context, "Favorite "+imagenamaTanaman.get(i),Toast.LENGTH_SHORT).show();
            }
        });
        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"onClick: clicked on: "+ imagenamaTanaman.get(i));
                Toast.makeText(context, "Share "+ imagenamaTanaman.get(i),Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return imagenamaTanaman.size();
    }

    @Override
    public int getItemViewType(int position){
        return position;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        Button btnFavorite;
        Button btnShare;
        ImageView image;
        TextView imageName;
        TextView ImageTanamansDesc;
        CardView parentLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.name_image);
            ImageTanamansDesc = itemView.findViewById(R.id.desc_image);
            parentLayout = itemView.findViewById(R.id.parent_layout);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);
        }
    }
}

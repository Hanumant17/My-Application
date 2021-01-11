package com.example.famousthings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {
    private Context context;
    List<Image> images;
    String INTENT_PARCELABLE;

    public ImageAdapter(Context context, List<Image> images) {
        this.context = context;
        this.images = images;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_image, parent,false);
        ImageViewHolder viewHolder  = new ImageViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        Image image = images.get(position);
        holder.imageSrc.setImageResource(image.getImageSrc());
        holder.title.setText(image.getImageTitle());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Bundle bundle = new Bundle();
             //  bundle.putInt("imagee", image.getImageSrc());
              // bundle.putString("namee",image.getImageTitle());
                Intent i = new Intent(v.getContext(), Description.class);
                i.putExtra(Description.EXTRA_PLACES, images.get(position));
                //i.putExtra("imagee", image.getImageSrc());
           //  i.putExtras(bundle);
               // final Intent intent = i.putExtra(bundle);
                v.getContext().startActivity(i);
            }
        });
    }



    @Override
    public int getItemCount() {
        return images.size();
    }


    public class ImageViewHolder extends RecyclerView.ViewHolder {
        ImageView imageSrc;
        TextView title;

        RelativeLayout relativeLayout;
        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageSrc =itemView.findViewById(R.id.image);
            this.title = itemView.findViewById(R.id.ititle);
            this.relativeLayout = itemView.findViewById(R.id.relative);


        }
    }
}

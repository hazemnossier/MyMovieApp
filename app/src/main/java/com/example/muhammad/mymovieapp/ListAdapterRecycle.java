package com.example.muhammad.mymovieapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/**
 * Created by Muhammad on 20/11/2016.
 */

public class ListAdapterRecycle extends RecyclerView.Adapter<ListAdapterRecycle.ViewHolder> {


    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView flickerImageView;
        RelativeLayout flickerImageContainer;
        ProgressBar progressBar;
        ImageButton favBtn;

        public ViewHolder(View itemView) {
            super(itemView);
            //   flickerImageView = (ImageView) itemView.findViewById(R.id.flickerImageView);
            //  flickerImageContainer = (RelativeLayout) itemView.findViewById(R.id.ImageContainer);
            // progressBar = (ProgressBar) itemView.findViewById(R.id.progressBar);
            //favBtn = (ImageButton) itemView.findViewById(R.id.favIcon);
        }
    }
}
package org.tensorflow.lite.examples.classification;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import org.tensorflow.lite.examples.classification.model.RecommendedList;

public class RecommenedListAdapter extends RecyclerView.Adapter<RecommenedListAdapter.ViewHolder> {
    private RecommendedList[] listdata;

    // RecyclerView recyclerView;
    public RecommenedListAdapter(RecommendedList[] listdata) {
        this.listdata = listdata;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final RecommendedList myListData = listdata[position];
        holder.textView.setText(listdata[position].getProductName());
        // holder.imageView.setImageResource(listdata[position].getProductImage());
        Picasso.get().load(listdata[position].getPhotoUrl())
                .error(R.drawable.image_not_found)
                .placeholder(R.drawable.image_not_found)
                .resize(350, 350)
                .into(holder.imageView);

    }


    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;
        public TextView seeDetails;

        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.product_imageView);
            this.textView = (TextView) itemView.findViewById(R.id.product_Name);
            seeDetails = (TextView) itemView.findViewById(R.id.see_Details);
        }
    }
}

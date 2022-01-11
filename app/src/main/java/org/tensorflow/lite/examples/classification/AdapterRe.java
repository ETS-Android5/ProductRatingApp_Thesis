package org.tensorflow.lite.examples.classification;

import android.app.Activity;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import org.tensorflow.lite.examples.classification.model.RecommendedList;

import java.util.ArrayList;
import java.util.List;

import static org.tensorflow.lite.examples.classification.AppData.PRODUCT_NAME;

public class AdapterRe extends RecyclerView.Adapter<AdapterRe.ViewHolder> {
    private Activity activity;
    private List<RecommendedList> recommendedLists = new ArrayList<>();

    public AdapterRe(Activity activity, List<RecommendedList> recommendedLists) {
        this.activity = activity;
        this.recommendedLists = recommendedLists;
    }

    @Override
    public AdapterRe.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.item, parent, false);
        ViewHolder holder = new ViewHolder(listItem);
        return holder;
    }

    @Override
    public void onBindViewHolder(AdapterRe.ViewHolder holder, int position) {

        final RecommendedList myListData = recommendedLists.get(position);
        holder.textView.setText(recommendedLists.get(position).getProductName());
        // holder.imageView.setImageResource(listdata[position].getProductImage());
        Picasso.get().load(recommendedLists.get(position).getPhotoUrl())
                .error(R.drawable.image_not_found)
                .placeholder(R.drawable.image_not_found)
                .resize(350, 350)
                .into(holder.imageView);



    }

    @Override
    public int getItemCount() {
        return recommendedLists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;
        public Button seeDetails;

        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.product_imageView);
            this.textView = (TextView) itemView.findViewById(R.id.product_Name);
            seeDetails =  itemView.findViewById(R.id.see_Details);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    activity.startActivity(new Intent(activity, DisplayRatingsActivity.class));
                    PRODUCT_NAME = recommendedLists.get(getAdapterPosition()).getProductName();

                    /*Intent intent = new Intent(this, DisplayRatingsActivity.class);
                    startActivity(intent);
                    PRODUCT_NAME = productName;
                    MainActivity.textView.setText("You have selected : "+myImageNameList[getAdapterPosition()]);
                    MainActivity.dialog.dismiss();*/
                }
            });
        }
    }
}
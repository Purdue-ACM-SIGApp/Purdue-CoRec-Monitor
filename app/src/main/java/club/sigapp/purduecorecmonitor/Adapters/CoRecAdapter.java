package club.sigapp.purduecorecmonitor.Adapters;

import android.location.Location;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.OnClick;


import java.util.List;

import butterknife.ButterKnife;
import club.sigapp.purduecorecmonitor.Models.LocationsModel;

import club.sigapp.purduecorecmonitor.R;

public class CoRecAdapter extends RecyclerView.Adapter<CoRecAdapter.AreaViewHolder> {

    private List<LocationsModel> locations;

    public CoRecAdapter(String[] favorites, List<LocationsModel> data){
        this.locations = data;
    }

    @Override
    public AreaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_main_layout, parent, false);

        return new AreaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AreaViewHolder holder, int position) {
        holder.cardTitle.setText(locations.get(position).LocationName);
    }

    @Override
    public int getItemCount() {
        return locations.size();
    }



    public class AreaViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.card_main)
        CardView cardMain;

        @BindView(R.id.fav_button)
        ImageButton favButton;

        @BindView(R.id.card_main_title)
        TextView cardTitle;

        public AreaViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        @OnClick(R.id.fav_button)
        public void onClickFav() {
            System.out.println("worked");
        }

    }
}

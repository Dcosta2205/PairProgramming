package com.masai.preclassvideos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PreClassAdapter extends RecyclerView.Adapter<PreClassAdapter.PreClassViewHolder> {

    private ItemClickListener listener;
    private List<PreClassModel> preClassModelList;

    public PreClassAdapter(List<PreClassModel> preClassModelList, ItemClickListener itemClickListener) {
        this.preClassModelList = preClassModelList;
        this.listener = itemClickListener;
    }

    @NonNull
    @Override
    public PreClassViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_data_layout, parent, false);
        return new PreClassViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PreClassViewHolder holder, int position) {
        PreClassModel model = preClassModelList.get(position);
        holder.trainerName.setText(model.getTrainerName());
        holder.lectureName.setText(model.getLectureName());
        holder.sessionTime.setText(model.getSessionTime());
    }

    @Override
    public int getItemCount() {
        return preClassModelList.size();
    }

    public class PreClassViewHolder extends RecyclerView.ViewHolder {

        private TextView lectureName;
        private TextView sessionTime;
        private TextView trainerName;
        private CardView cardView;

        public PreClassViewHolder(@NonNull View itemView) {
            super(itemView);
            initViews(itemView);
        }

        private void initViews(View itemView) {
            lectureName = itemView.findViewById(R.id.tvLectureName);
            sessionTime = itemView.findViewById(R.id.tvSessionTime);
            trainerName = itemView.findViewById(R.id.tvTrainerName);
            cardView = itemView.findViewById(R.id.cardView);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClicked(preClassModelList.get(getAdapterPosition()), getAdapterPosition());
                    ;
                }
            });

        }
    }
}

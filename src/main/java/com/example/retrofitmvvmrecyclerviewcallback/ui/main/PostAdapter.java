package com.example.retrofitmvvmrecyclerviewcallback.ui.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitmvvmrecyclerviewcallback.R;
import com.example.retrofitmvvmrecyclerviewcallback.pojo.PostModel;

import java.util.ArrayList;
import java.util.List;


public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    private List<PostModel> postsList = new ArrayList<>();

    @NonNull

    @Override
    public PostViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new PostViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull  PostAdapter.PostViewHolder holder, int position) {

        holder.titleTV.setText(postsList.get(position).getTitle());
        holder.userTV.setText(postsList.get(position).getUserId()+"");
        holder.bodyTV.setText(postsList.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }

    public void setlist(List<PostModel> postsList){
        this.postsList = postsList;
        notifyDataSetChanged();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {
        TextView titleTV , userTV , bodyTV;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTV = itemView.findViewById(R.id.titleTV);
            userTV = itemView.findViewById(R.id.userIDTV);
            bodyTV = itemView.findViewById(R.id.bodyTV);
        }
    }
}

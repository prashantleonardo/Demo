package com.example.veronica.github;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.Github;

import java.util.ArrayList;
public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private ArrayList<Github> mAndroidList;

    public DataAdapter(ArrayList<Github> androidList) {
        mAndroidList = androidList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.mTvTitle.setText(mAndroidList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return mAndroidList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView mTvTitle;
        public ViewHolder(View view){
            super(view);
            mTvTitle=(TextView)view.findViewById(R.id.tv_title);
        }
    }
    }

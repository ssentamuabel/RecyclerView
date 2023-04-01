package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter <UsersAdapter.ViewHolder>{

    private List<UserModel> userModelList;
    private Context context;
    private ClickedListener clickedListener;

    public UsersAdapter(List<UserModel>userModelList, Context context, ClickedListener clickedListener){
        this.userModelList=userModelList;
        this.context = context;
        this.clickedListener = clickedListener;
    }


    @NonNull
    @Override
    public UsersAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_user, parent, false);

        return  new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UsersAdapter.ViewHolder holder, int position) {
        UserModel user = userModelList.get(position);
        holder.username.setText(user.getUsername());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    clickedListener.clickedItem(user);
            }
        });
    }

    @Override
    public int getItemCount() {
        return userModelList.size();
    }
     public interface ClickedListener  {
            public void clickedItem(UserModel user);
     }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView username;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            username = (TextView)itemView.findViewById(R.id.tv_username);

        }
    }
}

package edu.sinhgad.submitassignmentsit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    String[] uploads, dates, times, uploaderNames;
    Context context;

    public RecyclerAdapter(Context context, String[] uploads, String[] dates, String[] times, String[] uploaderNames) {
        this.context = context;
        this.uploads = uploads;
        this.dates = dates;
        this.times = times;
        this.uploaderNames = uploaderNames;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.pdfNameTextView.setText(uploads[position]);
        holder.dateTextView.setText(dates[position]);
        holder.timeTextView.setText(times[position]);
        holder.uploaderNameTextView.setText(uploaderNames[position]);
    }

    @Override
    public int getItemCount() {
        return uploads.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView pdfNameTextView, dateTextView, timeTextView, uploaderNameTextView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            pdfNameTextView = itemView.findViewById(R.id.pdfNameTextView);
            dateTextView = itemView.findViewById(R.id.dateTextView);
            timeTextView = itemView.findViewById(R.id.timeTextView);
            uploaderNameTextView = itemView.findViewById(R.id.uploaderNameTextView);

        }

    }

}

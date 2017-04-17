package com.example.dadriaunna01.menulesson;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by cmltdstudent on 4/15/17.
 */

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {
    private List<Student> students;
    private Context context;

    public StudentAdapter(List<Student> students, Context context) {
        this.students = students;
        this.context = context;
    }

    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_student, parent, false);
        return new StudentViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(StudentViewHolder holder, int position) {
        Student meal = students.get(position);
        holder.bind(meal);
    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}

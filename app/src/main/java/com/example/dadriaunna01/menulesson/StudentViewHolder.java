package com.example.dadriaunna01.menulesson;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by cmltdstudent on 4/15/17.
 */

public class StudentViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView studentName;
    private TextView studentGrade;
    private ImageView studentPhotoView;
    private Context context;

    public StudentViewHolder(View itemView, Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        studentName = (TextView) itemView.findViewById(R.id.student_name);
        studentGrade = (TextView) itemView.findViewById(R.id.student_grade);
        studentPhotoView = (ImageView) itemView.findViewById(R.id.student_photo);
        this.context = context;
    }

    public void bind(final Student student) {
        studentName.setText(student.name);
        studentGrade.setText(String.valueOf(student.grade));
        studentPhotoView.setImageResource(student.photoId);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, SecondActivity.class);
                intent.putExtra(Key.STUDENT, student);

                context.startActivity(intent);


//                Toast.makeText(context, mealDescriptionView.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
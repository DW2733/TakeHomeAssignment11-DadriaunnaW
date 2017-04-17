package com.example.dadriaunna01.menulesson;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    private ImageView studentPhoto;
    private TextView studentName;
    private TextView studentGrade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        studentPhoto = (ImageView) findViewById(R.id.student_photo);
        studentName = (TextView) findViewById(R.id.student_name);
        studentGrade = (TextView) findViewById(R.id.student_grade);

        Intent intent = getIntent();
        Student newStudent = (Student) intent.getSerializableExtra(Key.STUDENT);
        studentPhoto.setImageResource(newStudent.photoId);
        studentName.setText(newStudent.name);
        studentGrade.setText(String.valueOf(newStudent.grade));


    }
}

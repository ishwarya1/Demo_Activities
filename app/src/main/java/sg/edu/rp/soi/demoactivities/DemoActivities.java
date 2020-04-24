package sg.edu.rp.soi.demoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DemoActivities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_activities);
        Button btnDone = findViewById(R.id.btndone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etname = findViewById(R.id.etName);
                EditText etage = findViewById(R.id.etage);
                String [] info = {etname.getText().toString(),etage.getText().toString()};
                Intent i = new Intent (DemoActivities.this,DemoActivities2.class);
                i.putExtra("info",info);
                startActivity(i);
            }
        });
    }
}

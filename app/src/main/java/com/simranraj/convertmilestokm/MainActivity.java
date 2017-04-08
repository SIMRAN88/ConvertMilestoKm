package com.simranraj.convertmilestokm;


        import android.os.Build;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonConvertMilesToKm=(Button)findViewById(R.id.ConvertMilesToKm);
        buttonConvertMilesToKm.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                EditText textBoxMiles=(EditText)findViewById(R.id.editTextMiles);
                EditText textBoxKms=(EditText)findViewById(R.id.editTextKms);
                double vMiles=Double.valueOf(textBoxMiles.getText().toString());
                double vKm=vMiles/0.62137;
                DecimalFormat formatVal=new DecimalFormat("##.##");

                textBoxKms.setText(formatVal.format(vKm));
            }
        });

        Button buttonConvertKmToMiles=(Button)findViewById(R.id.ConvertKmToMiles);
        buttonConvertKmToMiles.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText textBoxMiles = (EditText) findViewById(R.id.editTextMiles);
                EditText textBoxKms = (EditText) findViewById(R.id.editTextKms);
                double vKm = Double.valueOf(textBoxKms.getText().toString());
                double vMiles = vKm * 0.62137;
                DecimalFormat formatVal=new DecimalFormat("##.##");

                textBoxKms.setText(formatVal.format(vMiles));
            }
        });
    }
}

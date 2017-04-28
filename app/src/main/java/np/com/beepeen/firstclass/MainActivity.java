package np.com.beepeen.firstclass;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText numm;
    Button buttonn1,buttonn2,buttonn3,buttonn4,buttonn5,buttonn6,
            buttonn7,buttonn8,buttonn9,buttonn10,buttonn11,buttonn12,buttonn13,buttonn14,buttonn15,buttonn16;
    double fn,sn,rs;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numm=(EditText)findViewById(R.id.num);
        buttonn1=(Button)findViewById(R.id.button1);
        buttonn2=(Button) findViewById(R.id.button2);
        buttonn3=(Button) findViewById(R.id.button3);
        buttonn4=(Button) findViewById(R.id.button4);
        buttonn5=(Button) findViewById(R.id.button5);
        buttonn6=(Button)findViewById(R.id.button6);
        buttonn7=(Button) findViewById(R.id.button7);
        buttonn8=(Button) findViewById(R.id.button8);
        buttonn9=(Button) findViewById(R.id.button9);
        buttonn10=(Button) findViewById(R.id.button10);
        buttonn11=(Button)findViewById(R.id.button11);
        buttonn12=(Button) findViewById(R.id.button12);
        buttonn13=(Button) findViewById(R.id.button13);
        buttonn14=(Button) findViewById(R.id.button14);
        buttonn15=(Button) findViewById(R.id.button15);
        buttonn16=(Button) findViewById(R.id.button16);


    }
    public void one(View view){numm.setText(numm.getText()+buttonn1.getText().toString());}
    public void two(View view){numm.setText(numm.getText()+buttonn2.getText().toString());}
    public void three(View view){
        numm.setText(numm.getText()+buttonn3.getText().toString());
    }
    public void four(View view){numm.setText(numm.getText()+buttonn5.getText().toString());}
    public void five(View view){numm.setText(numm.getText()+buttonn6.getText().toString());}
    public void six(View view){numm.setText(numm.getText()+buttonn7.getText().toString());}
    public void seven(View view){numm.setText(numm.getText()+buttonn9.getText().toString());}
    public void eight(View view){numm.setText(numm.getText()+buttonn10.getText().toString());}
    public void nine(View view){numm.setText(numm.getText()+buttonn11.getText().toString());}
    public void zero(View view){numm.setText(numm.getText()+buttonn13.getText().toString());}
    public void clear(View view){numm.setText("");}

    public void sum(View view){
        fn=Double.valueOf(numm.getText().toString());
        numm.setText("");
        i=1;
    }
    public void sub(View view){
        fn=Double.valueOf(numm.getText().toString());
        numm.setText("");
        i=2;
    }
    public void mul(View view){
        fn=Double.valueOf(numm.getText().toString());
        numm.setText("");
        i=3;
    }
    public void div(View view){
        fn=Double.valueOf(numm.getText().toString());
        numm.setText("");
        i=4;
    }
    public void mod(View view){
        fn=Double.valueOf(numm.getText().toString());
        numm.setText("");
        i=5;
    }
    public void equal(View view){
        sn= Double.valueOf(numm.getText().toString());
        switch(i){
            case 1:
                rs=fn+sn;
                numm.setText(String.valueOf(rs));
                break;
            case 2:
                rs=fn-sn;
                numm.setText(String.valueOf(rs));
                break;
            case 3:
                rs=fn*sn;
                numm.setText(String.valueOf(rs));
                break;
            case 4:
                rs=fn/sn;
                numm.setText(String.valueOf(rs));
                break;
            case 5:
                rs=fn%sn;
                numm.setText(String.valueOf(rs));
                break;
        }



    }
    public void check4(View view){

    }

}

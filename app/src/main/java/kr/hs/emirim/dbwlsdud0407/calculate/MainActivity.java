package kr.hs.emirim.dbwlsdud0407.calculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button butPlus, butMinus, butdivide, butMultifly;
    EditText editNum1,editNum2;
    TextView textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butPlus=(Button)findViewById(R.id.But_sum);
        butMinus=(Button)findViewById(R.id.But_minus);
        butdivide=(Button)findViewById(R.id.But_divide);
        butMultifly=(Button)findViewById(R.id.But_multifly);
        editNum1=(EditText)findViewById(R.id.edit_num1);
        editNum2=(EditText)findViewById(R.id.edit_num2);
       textResult=(TextView)findViewById(R.id.text_Result);
        butPlus.setOnClickListener(this);
        butMinus.setOnClickListener(this);
        butdivide.setOnClickListener(this);
        butMultifly.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
      //2개의   EditText문장에 입력된 값을 반환받는다.
        String num1Str=editNum1.getText().toString();
        String num2Str=editNum2.getText().toString();
        int num1=Integer.parseInt(num1Str);
        int num2=Integer.parseInt(num2Str);
        double result=0;
        switch(v.getId()){  //객체가 가지고 있는 아이디값반환
            case R.id.But_sum:
              result=num1+num2;
                break;
            case R.id.But_minus:
                result=num1-num2;
                break;
            case R.id.But_divide:
                result=(double)num1*num2;
                break;
            case R.id.But_multifly:
                result=num1/num2;
                break;
        }
        textResult.setText("*계산결과: "+result);

    }
}

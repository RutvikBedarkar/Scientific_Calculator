package com.rrb.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.mbms.StreamingServiceInfo;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;


public class MainActivity extends AppCompatActivity {

    /*Button allClear, percentage, power, one, two, three, four, five, six, seven, eight, nine, zero, addition, subtraction, multiplication, division, doubleZero, dot, equals;
    Button sqrt, lBrace, rBrace, backSpace, log, sin, cos, tan;*/

    TextView previousCalculation;
    EditText txt_Input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_Input = findViewById(R.id.txt_Input);
        previousCalculation = findViewById(R.id.previousCalculation);

        txt_Input.setShowSoftInputOnFocus(false);
    }

    public void updateText(String strTOAdd){
      String oldString = txt_Input.getText().toString();
      int cursorPos = txt_Input.getSelectionStart();
      String leftString = oldString.substring(0,cursorPos);
      String rightString = oldString.substring(cursorPos);

      txt_Input.setText(String.format("%s%s%s",leftString,strTOAdd,rightString));
      txt_Input.setSelection(cursorPos + strTOAdd.length());
    }

    public void setZero(View view){
        updateText(getResources().getString(R.string.zero));
    }
    public void setOne(View view){
        updateText(getResources().getString(R.string.one));
    }
    public void setTwo(View view){
        updateText(getResources().getString(R.string.two));
    }
    public void setThree(View view){
        updateText(getResources().getString(R.string.three));
    }
    public void setFour(View view){
        updateText(getResources().getString(R.string.four));
    }
    public void setFive(View view){
        updateText(getResources().getString(R.string.five));
    }
    public void setSix(View view){
        updateText(getResources().getString(R.string.six));
    }
    public void setSeven(View view){
        updateText(getResources().getString(R.string.seven));
    }
    public void setEight(View view){
        updateText(getResources().getString(R.string.eight));
    }
    public void setNine(View view){
        updateText(getResources().getString(R.string.nine));
    }
    public void setDoubleZero(View view) {
        updateText(getResources().getString(R.string.double_zero));
    }
    public void setDot(View view){
        updateText(getResources().getString(R.string.dot));
    }

    public void setLeftPara(View view){
        updateText(getResources().getString(R.string.left_brace));
    }
    public void setRightPara(View view){
        updateText(getResources().getString(R.string.right_brace));
    }

    public void setAddition(View view){
        updateText(getResources().getString(R.string.addition));
    }
    public void setSubtraction(View view){
        updateText(getResources().getString(R.string.subtraction));
    }
    public void setMultiplication(View view){
        updateText(getResources().getString(R.string.multiplication));
    }
    public void setDivision(View view){

        updateText(getResources().getString(R.string.division));
    }

    public void setAllClear(View view){
        txt_Input.setText("");
        previousCalculation.setText("");
    }

    public void setPower(View view){
        updateText("^(");
    }
    public void setPercentage(View view){
        updateText(getResources().getString(R.string.percentage));
    }

    public void setSin(View view){
        updateText("sin");
    }
    public void setCos(View view){
        updateText("cos(");

    }
    public void setTan(View view){
        updateText("tan(");

    }
    public void setSqrt(View view){
        updateText(getResources().getString(R.string.squareroot));

    }
    public void setLog(View view){
        updateText("log(");

    }
    public void setLn(View view){
        updateText("ln(");

    }
    public void setPi(View view){
        updateText(getResources().getString(R.string.pi));
    }
    public void setExpo(View view){
        updateText(getResources().getString(R.string.e));
    }
    public void isPrimeOrNot(View view){
        updateText("ispr(");
    }

    public void setEqualsTo(View view){
        String userExp = txt_Input.getText().toString();
        previousCalculation.setText(userExp);

        userExp = userExp.replaceAll(getResources().getString(R.string.division),"/");
        userExp = userExp.replaceAll(getResources().getString(R.string.multiplication),"*");

        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());

        txt_Input.setText(result);
        txt_Input.setSelection(result.length());
    }

    public void setBackSpace(View view){
        int cursorPos = txt_Input.getSelectionStart();
        int textLength = txt_Input.getText().length();

        if(cursorPos !=0 && textLength !=0){
            SpannableStringBuilder selection = (SpannableStringBuilder)txt_Input.getText();
            //Allow us to do is manipulate our strings

            selection.replace(cursorPos-1, cursorPos, "");
            txt_Input.setText(selection);
            txt_Input.setSelection(cursorPos-1);
        }
    }
}



/*D9DFDB*/











































































































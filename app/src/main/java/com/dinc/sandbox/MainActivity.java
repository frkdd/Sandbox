package com.dinc.sandbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;

import android.text.format.Formatter;
import android.view.Gravity;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Stack;


public class MainActivity extends AppCompatActivity {

    EditText textBox;
    EditText textView;
    EditText textView2;
    EditText textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textBox = findViewById(R.id.editText);


        textBox.setText(" ");
    }

    public void typeOne(View view) {
        if (textBox.getText().toString().matches(" Infinity") || textBox.getText().toString().matches(" NaN")) {
            textBox.setText(" ");
        }
        int length = textBox.getText().length();
        textBox.setSelection(textBox.length());
        if (!textBox.getText().toString().regionMatches(length - 1, ")", 0, 1)) {
            textBox.append("1");
        }
    }


    public void typeTwo(View view) {
        if (textBox.getText().toString().matches(" Infinity") || textBox.getText().toString().matches(" NaN")) {
            textBox.setText(" ");
        }
        int length = textBox.getText().length();
        textBox.setSelection(textBox.length());
        if (!textBox.getText().toString().regionMatches(length - 1, ")", 0, 1)) {
            textBox.append("2");
        }
    }


    public void typeThree(View view) {
        if (textBox.getText().toString().matches(" Infinity") || textBox.getText().toString().matches(" NaN")) {
            textBox.setText(" ");
        }
        int length = textBox.getText().length();
        textBox.setSelection(textBox.length());
        if (!textBox.getText().toString().regionMatches(length - 1, ")", 0, 1)) {
            textBox.append("3");
        }
    }


    public void typeFour(View view) {
        if (textBox.getText().toString().matches(" Infinity") || textBox.getText().toString().matches(" NaN")) {
            textBox.setText(" ");
        }
        int length = textBox.getText().length();
        textBox.setSelection(textBox.length());
        if (!textBox.getText().toString().regionMatches(length - 1, ")", 0, 1)) {
            textBox.append("4");
        }
    }


    public void typeFive(View view) {
        if (textBox.getText().toString().matches(" Infinity") || textBox.getText().toString().matches(" NaN")) {
            textBox.setText(" ");
        }
        int length = textBox.getText().length();
        textBox.setSelection(textBox.length());
        if (!textBox.getText().toString().regionMatches(length - 1, ")", 0, 1)) {
            textBox.append("5");
        }
    }


    public void typeSix(View view) {
        if (textBox.getText().toString().matches(" Infinity") || textBox.getText().toString().matches(" NaN")) {
            textBox.setText(" ");
        }
        int length = textBox.getText().length();
        textBox.setSelection(textBox.length());
        if (!textBox.getText().toString().regionMatches(length - 1, ")", 0, 1)) {
            textBox.append("6");
        }
    }


    public void typeSeven(View view) {
        if (textBox.getText().toString().matches(" Infinity") || textBox.getText().toString().matches(" NaN")) {
            textBox.setText(" ");
        }
        int length = textBox.getText().length();
        textBox.setSelection(textBox.length());
        if (!textBox.getText().toString().regionMatches(length - 1, ")", 0, 1)) {
            textBox.append("7");
        }
    }


    public void typeEight(View view) {
        if (textBox.getText().toString().matches(" Infinity") || textBox.getText().toString().matches(" NaN")) {
            textBox.setText(" ");
        }
        int length = textBox.getText().length();
        textBox.setSelection(textBox.length());
        if (!textBox.getText().toString().regionMatches(length - 1, ")", 0, 1)) {
            textBox.append("8");
        }
    }


    public void typeNine(View view) {
        if (textBox.getText().toString().matches(" Infinity") || textBox.getText().toString().matches(" NaN")) {
            textBox.setText(" ");
        }
        int length = textBox.getText().length();
        textBox.setSelection(textBox.length());
        if (!textBox.getText().toString().regionMatches(length - 1, ")", 0, 1)) {
            textBox.append("9");
        }
    }


    public void typeZero(View view) {
        if (textBox.getText().toString().matches(" Infinity") || textBox.getText().toString().matches(" NaN")) {
            textBox.setText(" ");
        }
        int length = textBox.getText().length();
        textBox.setSelection(textBox.length());
        if (!textBox.getText().toString().regionMatches(length - 1, ")", 0, 1)) {
            textBox.append("0");
        }
    }

    public void clearEverything(View view) {

        AlertDialog.Builder ClearHistory = new AlertDialog.Builder(this);

        ClearHistory.setTitle("Clear Calculation History");
        ClearHistory.setMessage("Are you sure to clear the calculation history?");
        ClearHistory.setPositiveButton("Clear", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                textBox.setText(" ");
                textView.setText("");
                textView2.setText("");
                textView3.setText("");
            }
        });
        ClearHistory.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        Button button = (Button) findViewById(R.id.buttonCE);
        button.setOnLongClickListener(new Button.OnLongClickListener() {
            public boolean onLongClick(View V) {
                ClearHistory.show();
                return true;
            }
        });
        textBox.setText(" ");
    }

    public void clear(View view) {
        int length = textBox.getText().length();
        if (textBox.getText().toString().matches(" Infinity") || textBox.getText().toString().matches(" NaN")) {
            textBox.setText(" ");
        } else {
            if (textBox.getText().toString().regionMatches(length - 1, " ", 0, 1)) {
            } else if (textBox.getText().toString().regionMatches(length - 2, "(-", 0, 2)) {
                textBox.getText().delete(length - 2, length);
            } else if (length > 0) {
                textBox.getText().delete(length - 1, length);
            }

        }
    }

    public void typeDecimal(View view) {
        textBox.setSelection(textBox.length());

        int length = textBox.getText().length();
        if (textBox.getText().toString().matches("")
                || textBox.getText().toString().matches(" Infinity")
                || textBox.getText().toString().matches(" NaN")
                || textBox.getText().toString().matches(" ")
                || textBox.getText().toString().regionMatches(length - 1, "+", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, "-", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, "×", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, ".", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, "÷", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, ")", 0, 1)) {

        } else {
            textBox.append(".");
        }
    }

    public void sum(View view) {
        textBox.setSelection(textBox.length());
        String text = textBox.getText().toString();
        int length = textBox.getText().length();

        //OpenBracket Count
        int opBraCount = 0;
        char opBra = '(';
        {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == opBra) {
                    opBraCount++;
                }
            }
        }
        //ClosedBracket Counter
        int clBraCount = 0;
        char clBra = ')';
        {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == clBra) {
                    clBraCount++;
                }
            }
        }

        if (textBox.getText().toString().matches("")
                || textBox.getText().toString().matches(" Infinity")
                || textBox.getText().toString().matches(" NaN")
                || textBox.getText().toString().regionMatches(length - 1, " ", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, "+", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, "-", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, "×", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, ".", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, "÷", 0, 1)) {

        } else {
            if (text.contains("(")) {
                if (opBraCount == clBraCount + 1)
                    textBox.append(")");
            }
            textBox.append("+");
        }
    }

    public void deduct(View view) {
        textBox.setSelection(textBox.length());
        String text = textBox.getText().toString();
        int length = textBox.getText().length();

        //OpenBracket Count
        int opBraCount = 0;
        char opBra = '(';
        {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == opBra) {
                    opBraCount++;
                }
            }
        }
        //ClosedBracket Counter
        int clBraCount = 0;
        char clBra = ')';
        {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == clBra) {
                    clBraCount++;
                }
            }
        }

        if (textBox.getText().toString().regionMatches(length - 2, "(-", 0, 2)
                || textBox.getText().toString().regionMatches(length - 1, ".", 0, 1)) {
        } else {
            if (textBox.getText().toString().matches(" Infinity")
                    || textBox.getText().toString().matches(" NaN")) {
            } else {
                if (textBox.getText().toString().matches("")
                        || textBox.getText().toString().matches(" ")
                        || textBox.getText().toString().regionMatches(length - 1, "-", 0, 1)
                        || textBox.getText().toString().regionMatches(length - 1, "+", 0, 1)
                        || textBox.getText().toString().regionMatches(length - 1, "×", 0, 1)
                        || textBox.getText().toString().regionMatches(length - 1, "÷", 0, 1)) {
                    textBox.append("(-");
                } else {
                    if (opBraCount == clBraCount + 1) {
                        textBox.append(")");
                    }
                    textBox.append("-");
                }
            }
        }
    }

    public void multiply(View view) {
        textBox.setSelection(textBox.length());
        String text = textBox.getText().toString();
        int length = textBox.getText().length();

        //OpenBracket Count
        int opBraCount = 0;
        char opBra = '(';
        {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == opBra) {
                    opBraCount++;
                }
            }
        }
        //ClosedBracket Counter
        int clBraCount = 0;
        char clBra = ')';
        {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == clBra) {
                    clBraCount++;
                }
            }
        }

        if (textBox.getText().toString().matches("")
                || textBox.getText().toString().matches(" Infinity")
                || textBox.getText().toString().matches(" NaN")
                || textBox.getText().toString().regionMatches(length - 1, " ", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, "+", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, "-", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, "×", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, ".", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, "÷", 0, 1)) {

        } else {
            if (opBraCount == clBraCount + 1)
                textBox.append(")");
            textBox.append("×");
        }
    }

    public void divide(View view) {
        textBox.setSelection(textBox.length());
        String text = textBox.getText().toString();
        int length = textBox.getText().length();

        //OpenBracket Count
        int opBraCount = 0;
        char opBra = '(';
        {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == opBra) {
                    opBraCount++;
                }
            }
        }
        //ClosedBracket Counter
        int clBraCount = 0;
        char clBra = ')';
        {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == clBra) {
                    clBraCount++;
                }
            }
        }

        if (textBox.getText().toString().matches("")
                || textBox.getText().toString().matches(" Infinity")
                || textBox.getText().toString().matches(" NaN")
                || textBox.getText().toString().regionMatches(length - 1, " ", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, "+", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, "-", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, "×", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, ".", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, "÷", 0, 1)) {

        } else {
            if (opBraCount == clBraCount + 1) {
                textBox.append(")");
            }
            textBox.append("÷");
        }
    }


    public void result(View view) {

        String text = textBox.getText().toString();
        int length = textBox.getText().length();

        //OpenBracket Count
        int opBraCount = 0;
        char opBra = '(';
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == opBra) {
                opBraCount++;
            }
        }

        //ClosedBracket Counter
        int clBraCount = 0;
        char clBra = ')';
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == clBra) {
                clBraCount++;
            }
        }

        if (textBox.getText().toString().matches("")
                || textBox.getText().toString().matches(" Infinity")
                || textBox.getText().toString().matches(" NaN")
                || textBox.getText().toString().regionMatches(length - 1, "+", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, "-", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, "×", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, ".", 0, 1)
                || textBox.getText().toString().regionMatches(length - 1, "÷", 0, 1)) {

        } else {
            if (opBraCount == clBraCount + 1) {
                String a = textView.getText().toString();
                String b = textView2.getText().toString();

                textView.setText(text);
                textView.append(")" + " ");
                textView2.setText(a);
                textView3.setText(b);
                textBox.setText(" ");
            } else {
                String a = textView.getText().toString();
                String b = textView2.getText().toString();

                textView.setText(text + " ");
                textView.append(" ");
                textView2.setText(a);
                textView3.setText(b);
                textBox.setText(" ");
            }
            textView.setSelection(textView.length());
            textView2.setSelection(textView2.length());
            textView3.setSelection(textView3.length());

            //CALCULATOR EVALUATION SYSTEM
            char space = ' ';
            char minus = '-';
            char dsign = '÷';
            char plus = '+';
            char msign = '×';

            for (int i = 0; i < text.length(); i++) {
                if (text.regionMatches(i - 1, "(-", 0, 2)) {
                } else if (text.charAt(i) == msign
                        | text.charAt(i) == plus
                        | text.charAt(i) == space
                        | text.charAt(i) == dsign
                        | text.charAt(i) == minus) {
                }
            }


            text = textView.getText().toString();

            Stack<Integer> entry = new Stack<Integer>();
            Stack<Integer> output = new Stack<Integer>();
            //Start Point of numbers
            for (int i = 0; i < text.length() - 1; i++) {
                if (text.regionMatches(i - 1, "(-", 0, 2)) {
                } else if (text.charAt(i) == msign
                        | text.charAt(i) == plus
                        | text.charAt(i) == space
                        | text.charAt(i) == dsign
                        | text.charAt(i) == minus) {
                    entry.push(i + 1);
                }
            }
            //End point of numbers
            for (int a = 1; a < text.length(); a++) {
                if (text.regionMatches(a - 1, "(-", 0, 2)) {
                } else if (text.charAt(a) == msign
                        | text.charAt(a) == plus
                        | text.charAt(a) == space
                        | text.charAt(a) == dsign
                        | text.charAt(a) == minus) {
                    output.push(a);
                }
            }
            //Locations of signs
            Stack<String> split = new Stack<String>();
            Stack<Integer> signQua = new Stack<Integer>();
            int signNumber = 0;
            for (int d = 0; d < text.length() - 1; d++) {
                if (text.regionMatches(d - 1, "(-", 0, 2)) {
                } else if (text.charAt(d) == msign
                        | text.charAt(d) == plus
                        | text.charAt(d) == dsign
                        | text.charAt(d) == minus) {
                    signNumber++;
                }
            }
            if (signNumber >= 0) {
                for (int e = 0; e < signNumber + 1; e++) {
                    String splitted = text.substring(entry.elementAt(e), output.elementAt(e));
                    split.push(splitted);
                    signQua.push(signNumber);
                }
            }
            //Signs
            Stack<String> signs = new Stack<String>();
            for (int f = 0; f < text.length(); f++) {
                if (text.regionMatches(f - 1, "(-", 0, 2)) {
                } else if (text.charAt(f) == msign
                        | text.charAt(f) == plus
                        | text.charAt(f) == dsign
                        | text.charAt(f) == minus) {
                    signs.push(text.substring(f, f + 1));
                }
            }
            // Decimal dot counter
            int dotCount = 0;
            Stack<String> dot = new Stack<String>();
            for (int x = 0; x < text.length(); x++) {
                if (text.charAt(x) == '.') {
                    dotCount++;
                }
            }
            if (dotCount > split.size()) {
                Toast.makeText(getApplicationContext(), "Decimal dots have to be corrected", Toast.LENGTH_LONG).show();
                textView.setTextColor(Color.parseColor("#BC1A1A"));
            } else {
                textView.setTextColor(Color.parseColor("#656565"));
                //EVALUATE
                for (int k = 0; k < text.length(); k++) {
                    if (signs.size() == 1) {
                        k = 0;
                    }
                    if (split.elementAt(0).contains("-") & !split.elementAt(0).contains("(")) {
                        split.setElementAt("(" + split.elementAt(0) + ")", 0);
                    }
                    if (signs.size() == 0) {
                        textBox.setText(" " + split.elementAt(0));
                        break;
                    }
                    if (k != 0 & signs.elementAt(0).equals("÷")) {
                        k = 0;
                    }
                    if (signs.elementAt(k).equals("÷")) {
                        if (k != 0 & signs.elementAt(0).equals("÷")) {
                            k = 0;
                        }
                        double a = ((Double.parseDouble(split.elementAt(k).replace("(", "").replace(")", "")))
                                / (Double.parseDouble(split.elementAt(k + 1).replace("(", "").replace(")", ""))));
                       // NumberFormat formatter = new DecimalFormat("#0.0000");
                       // formatter.format(a);
                        split.removeElementAt(k);
                        split.removeElementAt(k);
                        signs.removeElementAt(k);
                        String c = Double.toString(a);
                        split.add(k, c);
                        k = 0;
                    } else if (!signs.contains("÷")) {
                        if (signs.size() == 1) {
                            k = 0;
                        }
                        if (split.elementAt(0).contains("-") & !split.elementAt(0).contains("(")) {
                            split.setElementAt("(" + split.elementAt(0) + ")", 0);
                        }
                        if (signs.size() == 0) {
                            textBox.setText(" " + split.elementAt(0));
                            break;
                        }
                        if (k != 0 & signs.elementAt(0).equals("×")) {
                            k = 0;
                        }
                        if (signs.elementAt(k).equals("×")) {
                            if (k != 0 & signs.elementAt(0).equals("×")) {
                                k = 0;
                            }
                            double a = ((Double.parseDouble(split.elementAt(k).replace("(", "").replace(")", "")))
                                    * (Double.parseDouble(split.elementAt(k + 1).replace("(", "").replace(")", ""))));
                            split.removeElementAt(k);
                            split.removeElementAt(k);
                            signs.removeElementAt(k);
                            String c = Double.toString(a);
                            split.add(k, c);
                            k = 0;
                        } else if (!signs.contains("×")) {
                            if (signs.size() == 1) {
                                k = 0;
                            }
                            if (split.elementAt(0).contains("-") & !split.elementAt(0).contains("(")) {
                                split.setElementAt("(" + split.elementAt(0) + ")", 0);
                            }
                            if (signs.size() == 0) {
                                textBox.setText(" " + split.elementAt(0));
                                break;
                            }
                            if (k != 0 & signs.elementAt(0).equals("+") | signs.elementAt(0).equals("-")) {
                                k = 0;
                            }
                            if (signs.elementAt(k).equals("+") | signs.elementAt(k).equals("-")) {
                                if (k != 0 & signs.elementAt(0).equals("+") | signs.elementAt(0).equals("-")) {
                                    k = 0;
                                }
                                Stack<Double> a = new Stack<Double>();
                                if (signs.elementAt(k).equals("+")) {
                                    a.push((Double.parseDouble(split.elementAt(k).replace("(", "").replace(")", "")))
                                            + (Double.parseDouble(split.elementAt(k + 1).replace("(", "").replace(")", ""))));
                                }
                                if (signs.elementAt(k).equals("-")) {
                                    a.push((Double.parseDouble(split.elementAt(k).replace("(", "").replace(")", "")))
                                            - (Double.parseDouble(split.elementAt(k + 1).replace("(", "").replace(")", ""))));
                                }
                                split.removeElementAt(k);
                                split.removeElementAt(k);
                                signs.removeElementAt(k);

                                String c = Double.toString(a.elementAt(0));
                                split.add(k, c);
                                k = 0;
                            }
                        }
                    }
                }
//EVALUATION SYSTEM
            }
        }
    }
}
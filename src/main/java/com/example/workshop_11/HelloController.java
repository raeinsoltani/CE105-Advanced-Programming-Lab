package com.example.workshop_11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class HelloController {

    String str = "0";

    @FXML
    private TextField text;

    @FXML
    public void onAC() {
        str = "0";
        text.setText(str);
    }

    @FXML
    public void on1() {
        if (str.equals("0")) {
            str = "1";
        }
        else {
            str += "1";
        }
        text.setText(str);
    }

    @FXML
    public void on2() {
        if (str.equals("0")) {
            str = "2";
        }
        else {
            str += "2";
        }
        text.setText(str);
    }

    @FXML
    public void on3() {
        if (str.equals("0")) {
            str = "3";
        }
        else {
            str += "3";
        }
        text.setText(str);
    }

    @FXML
    public void on4() {
        if (str.equals("0")) {
            str = "4";
        }
        else {
            str += "4";
        }
        text.setText(str);
    }

    @FXML
    public void on5() {
        if (str.equals("0")) {
            str = "5";
        }
        else {
            str += "5";
        }
        text.setText(str);
    }

    @FXML
    public void on6() {
        if (str.equals("0")) {
            str = "6";
        }
        else {
            str += "6";
        }
        text.setText(str);
    }

    @FXML
    public void on7() {
        if (str.equals("0")) {
            str = "7";
        }
        else {
            str += "7";
        }
        text.setText(str);
    }

    @FXML
    public void on8() {
        if (str.equals("0")) {
            str = "8";
        }
        else {
            str += "8";
        }
        text.setText(str);
    }

    @FXML
    public void on9() {
        if (str.equals("0")) {
            str = "9";
        }
        else {
            str += "9";
        }
        text.setText(str);
    }

    @FXML
    public void on0() {
        if (str.equals("0")) {
            str = "0";
        }
        else {
            str += "0";
        }
        text.setText(str);
    }

    @FXML
    public void onPlus() {
        str += "+";
        text.setText(str);
    }

    @FXML
    public void onMinus() {
        str += "-";
        text.setText(str);
    }

    @FXML
    public void onMul() {
        str += "*";
        text.setText(str);
    }

    @FXML
    public void onDev() {
        str += "/";
        text.setText(str);
    }

    @FXML
    public void onDot() {
        str += ".";
        text.setText(str);
    }

    @FXML
    public void onEqual() {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+'){
                double d = Double.parseDouble(str.substring(0, i)) + Double.parseDouble(str.substring(i+1, str.length()));
                str = String.valueOf(d);
                System.out.println(d);
                text.setText(str);
                break;
            }
            else if (str.charAt(i) == '-'){
                double d = Double.parseDouble(str.substring(0, i)) - Double.parseDouble(str.substring(i+1, str.length()));
                str = String.valueOf(d);
                System.out.println(d);
                text.setText(str);
                break;
            }
            else if (str.charAt(i) == '*'){
                double d = Double.parseDouble(str.substring(0, i)) * Double.parseDouble(str.substring(i+1, str.length()));
                str = String.valueOf(d);
                System.out.println(d);
                text.setText(str);
                break;
            }
            else if (str.charAt(i) == '/'){
                double d = Double.parseDouble(str.substring(0, i)) / Double.parseDouble(str.substring(i+1, str.length()));
                str = String.valueOf(d);
                System.out.println(d);
                text.setText(str);
                break;
            }
        }
    }

}
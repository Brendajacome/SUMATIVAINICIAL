package com.example.ejercicio1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication {

    public static void main(String[] args) {
      for (int i=1; i<=100; i++){
          String Result = "";
          if (i % 3==0){
              Result += "fizz";
          }
          if (i % 5==0){
              Result += "buzz";
          }
          if (Result.isEmpty()){
              Result += i;
          }
          System.out.println(Result);
      }
    }
}
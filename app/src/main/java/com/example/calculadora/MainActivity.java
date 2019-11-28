package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.nio.DoubleBuffer;

public class MainActivity extends AppCompatActivity {
    public String enPantalla = "";
    public int numeroEnMemoria = 0;

    public int primerValorInt = 0;
    public int segundoValorInt = 0;
    public String resultadoUltimaOperacion = "";

    private float primerValorDecimal = 0;
    private float segundoValorDecimal = 0;
    private String segundoValorS = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //DECLARAMOS EL INTENT PARA PASAR A LA SIGUIETNE ACTIVITY
    public void siguiente(View view){
        Intent intent = new Intent(this, Calculadora2Activity.class);

        Bundle miBundle = new Bundle();
        miBundle.putString("resultado", resultadoUltimaOperacion);
        intent.putExtras(miBundle);
        startActivity(intent);
    }
    //-----------------------------------------------------------

    //NUMEROS----------------------------------------------------
    public void mostrar1(View view) {
        TextView muestra = findViewById(R.id.calculadoraDisplay);
        String boton1 = "1";
        enPantalla+=boton1;
        muestra.setText(enPantalla);
    }
    public void mostrar2(View view) {
        TextView muestra = findViewById(R.id.calculadoraDisplay);
        String boton2 = "2";
        enPantalla+=boton2;
        muestra.setText(enPantalla);
    }
    public void mostrar3(View view) {
        TextView muestra = findViewById(R.id.calculadoraDisplay);
        String boton2 = "3";
        enPantalla+=boton2;
        muestra.setText(enPantalla);
    }
    public void mostrar4(View view) {
        TextView muestra = findViewById(R.id.calculadoraDisplay);
        String boton2 = "4";
        enPantalla+=boton2;
        muestra.setText(enPantalla);
    }
    public void mostrar5(View view) {
        TextView muestra = findViewById(R.id.calculadoraDisplay);
        String boton2 = "5";
        enPantalla+=boton2;
        muestra.setText(enPantalla);
    }
    public void mostrar6(View view) {
        TextView muestra = findViewById(R.id.calculadoraDisplay);
        String boton2 = "6";
        enPantalla+=boton2;
        muestra.setText(enPantalla);
    }
    public void mostrar7(View view) {
        TextView muestra = findViewById(R.id.calculadoraDisplay);
        String boton2 = "7";
        enPantalla+=boton2;
        muestra.setText(enPantalla);
    }
    public void mostrar8(View view) {
        TextView muestra = findViewById(R.id.calculadoraDisplay);
        String boton2 = "8";
        enPantalla+=boton2;
        muestra.setText(enPantalla);
    }
    public void mostrar9(View view) {
        TextView muestra = findViewById(R.id.calculadoraDisplay);
        String boton2 = "9";
        enPantalla+=boton2;
        muestra.setText(enPantalla);
    }
    public void mostrar0(View view) {
        TextView muestra = findViewById(R.id.calculadoraDisplay);
        String boton2 = "0";
        enPantalla+=boton2;
        muestra.setText(enPantalla);
    }
    public void mostrarPunto(View view) {
        TextView muestra = findViewById(R.id.calculadoraDisplay);
        String boton2 = ".";
        enPantalla+=boton2;
        muestra.setText(enPantalla);
    }
    //-----------------------------------------------------------

    //SIMBOLOS---------------------------------------------------
    public void mostrarMas(View view){
        TextView muestra = findViewById(R.id.calculadoraDisplay);
        if(enPantalla.isEmpty())
        {
            muestra.setText("");
        }
        else if(enPantalla.contains(".")){
            primerValorDecimal = Float.parseFloat(enPantalla);
            String botonMas = "+";
            enPantalla+=botonMas;
            muestra.setText(enPantalla);
        }
        else{
            primerValorInt = Integer.parseInt(enPantalla);
            String botonMas = "+";
            enPantalla+=botonMas;
            muestra.setText(enPantalla);
        }
    }
    public void mostrarMenos(View view){
        TextView muestra = findViewById(R.id.calculadoraDisplay);
        if(enPantalla.isEmpty())
        {
            muestra.setText("");
        }
        else if(enPantalla.contains(".")){
            primerValorDecimal = Float.parseFloat(enPantalla);
            String botonMas = "-";
            enPantalla+=botonMas;
            muestra.setText(enPantalla);
        }
        else{
            primerValorInt = Integer.parseInt(enPantalla);
            String botonMas = "-";
            enPantalla+=botonMas;
            muestra.setText(enPantalla);
        }
    }
    public void mostrarMultiplicacion(View view){
        TextView muestra = findViewById(R.id.calculadoraDisplay);
        if(enPantalla.isEmpty())
        {
            muestra.setText(enPantalla);
        }
        else if(enPantalla.contains(".")){
            primerValorDecimal = Float.parseFloat(enPantalla);
            String botonMas = "*";
            enPantalla+=botonMas;
            muestra.setText(enPantalla);
        }
        else{
            primerValorInt = Integer.parseInt(enPantalla);
            String botonMas = "*";
            enPantalla+=botonMas;
            muestra.setText(enPantalla);
        }
    }
    public void mostrarDivision(View view){
        TextView muestra = findViewById(R.id.calculadoraDisplay);
        if(enPantalla.isEmpty())
        {
            muestra.setText(enPantalla);
        }
        else if(enPantalla.contains(".")){
            primerValorDecimal = Float.parseFloat(enPantalla);
            String botonMas = "/";
            enPantalla+=botonMas;
            muestra.setText(enPantalla);
        }
        else{
            primerValorInt = Integer.parseInt(enPantalla);
            String botonMas = "/";
            enPantalla+=botonMas;
            muestra.setText(enPantalla);
        }
    }
    public void mostrarRaiz(View view){
        TextView muestra = findViewById(R.id.calculadoraDisplay);
        float resultadoRaizInt;
        Double resultadoRaizFloat;

        if(enPantalla.isEmpty())
        {
            muestra.setText(enPantalla);
        }
        else if(enPantalla.contains(".")){
            primerValorDecimal = Float.parseFloat(enPantalla);
            resultadoRaizFloat = Math.sqrt(primerValorDecimal);
            enPantalla=Double.toString(resultadoRaizFloat);
            resultadoUltimaOperacion=enPantalla;
            muestra.setText(enPantalla);
        }
        else{
            primerValorInt = Integer.parseInt(enPantalla);
            resultadoRaizInt = (float) Math.sqrt(primerValorInt);
            enPantalla=Double.toString(resultadoRaizInt);
            resultadoUltimaOperacion=enPantalla;
            muestra.setText(enPantalla);
        }
    }
    public void mostrarPotencia(View view){
        TextView muestra = findViewById(R.id.calculadoraDisplay);
        if(enPantalla.isEmpty())
        {
            muestra.setText(enPantalla);
        }
        else if(enPantalla.contains(".")){
            primerValorDecimal = Float.parseFloat(enPantalla);
            String botonMas = "^";
            enPantalla+=botonMas;
            resultadoUltimaOperacion=enPantalla;
            muestra.setText(enPantalla);
        }
        else{
            primerValorInt = Integer.parseInt(enPantalla);
            String botonMas = "^";
            enPantalla+=botonMas;
            resultadoUltimaOperacion=enPantalla;
            muestra.setText(enPantalla);
        }
    }
    //------------------------------------------------------------

    //BOTONES MC, MR y MS ----------------------------------------
    public void memoriaMC(View view){
        if(numeroEnMemoria == 0){

        }
        else{
            numeroEnMemoria=0;
        }
    }
    public void memoriaMR(View view){
        TextView muestra = findViewById(R.id.calculadoraDisplay);
        if(numeroEnMemoria==0){

        }
        else {
            enPantalla=Integer.toString(numeroEnMemoria);
            muestra.setText(enPantalla);
        }
    }
    public void memoriaMS(View view){
        TextView muestra = findViewById(R.id.calculadoraDisplay);
        if(enPantalla.contains("+") || enPantalla.isEmpty() || enPantalla.contains("-") || enPantalla.contains("*") || enPantalla.contains("/") || enPantalla.contains("^")){

        }
        else{
            numeroEnMemoria = Integer.parseInt(enPantalla);
            muestra.setText("");
        }
    }
    //------------------------------------------------------------

    //LIMPIAR-----------------------------------------------------
    public void limpiar(View view){
        enPantalla="";
        TextView muestra = findViewById(R.id.calculadoraDisplay);
        muestra.setText(enPantalla);
    }

    public void borrar(View view){
        TextView muestra = findViewById(R.id.calculadoraDisplay);

        if(enPantalla.isEmpty()){
            muestra.setText("");
        }
        else{
            enPantalla = enPantalla.substring(0,enPantalla.length()-1);
            muestra.setText(enPantalla);
        }
    }
    //------------------------------------------------------------

    //OPERACIONES CUANDO SE OPRIMA = ----------------------------
    public void mostrarIgual(View view){

        String primerValorS = Integer.toString(primerValorInt);
        segundoValorS = enPantalla.substring(primerValorS.length()+1, enPantalla.length());
        segundoValorInt = Integer.parseInt(segundoValorS);

        int resultado = 0;

        TextView muestra = findViewById(R.id.calculadoraDisplay);

        if(enPantalla.contains("+")) {
            resultado = primerValorInt+segundoValorInt;
            enPantalla= Integer.toString(resultado);
            resultadoUltimaOperacion=enPantalla;
            primerValorInt=0;
            segundoValorInt=0;
            muestra.setText(enPantalla);
        }
        else if(enPantalla.contains("-")){
            resultado=primerValorInt-segundoValorInt;
            enPantalla=Integer.toString(resultado);
            resultadoUltimaOperacion=enPantalla;
            primerValorInt=0;
            segundoValorInt=0;
            muestra.setText(enPantalla);
        }
        else if(enPantalla.contains("*")){
            resultado=primerValorInt*segundoValorInt;
            enPantalla=Integer.toString(resultado);
            resultadoUltimaOperacion=enPantalla;
            primerValorInt=0;
            segundoValorInt=0;
            muestra.setText(enPantalla);
        }
        else if(enPantalla.contains("/")){
            resultado=primerValorInt/segundoValorInt;
            enPantalla=Integer.toString(resultado);
            resultadoUltimaOperacion=enPantalla;
            primerValorInt=0;
            segundoValorInt=0;
            muestra.setText(enPantalla);
        }
        else if(enPantalla.contains("^")){
            resultado= (int) Math.pow(primerValorInt, segundoValorInt);
            enPantalla=Integer.toString(resultado);
            resultadoUltimaOperacion=enPantalla;
            primerValorInt=0;
            segundoValorInt=0;
            muestra.setText(enPantalla);
        }
    }

}

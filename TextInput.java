package com.haybankz;




/**
 * Created by LENOVO on 3/24/2018.
 */
public class TextInput {

    //StringBuilder to hold value of textinput
    private StringBuilder  sb = new StringBuilder();


    //method to add new character to current value
    public void add(char c){

        sb.append(c);
    }


    //method to get current value of TextInput
    public String getValue(){

        return sb.toString();
    }



    //main method to test TextInput class
    public static void main(String[] args){
        TextInput textInput = new TextInput();
        textInput.add('a');
        textInput.add('b');
        textInput.add('9');
        textInput.add('c');

        System.out.println("value = "+ textInput.getValue());


    }


}





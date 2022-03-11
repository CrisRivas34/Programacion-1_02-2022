/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordrepeated;

/**
 *
 * @author Personal
 */
public class Utility {
     static public int GetBiggest(int... numberList){
        int max = numberList[0];
        for(int i=0; i<numberList.length; i++){
            if (numberList[i] > max){
                max = numberList[i];
            }
        }
        return max;
    }
   
    static public String Uncapitaller(String word){
        word = word.toLowerCase();
        return word;
    }
    
    static public String[]Repeated(String sentence){ 
    String[] words = sentence.split(" ");
    String[] lista = new String[words.length];
    int[] listanumeros = new int[words.length];
    int WordNumber[] = new int [words.length];
    
    for (int i=0; i<WordNumber.length; i++){
        WordNumber[i] = 0;
        words[i] = Uncapitaller(words[i]);
    }
    for(int j=0; j<words.length; j++){
        for(int k=0; k<words.length; k++){
            if(words[j].equals(words[k])){
                WordNumber[j]+= 1;
            }
        lista[j] = words[j];
        listanumeros[j] = WordNumber[j]; 
        }
    }
    int max = GetBiggest(WordNumber);
    int maxIndex = 0;
    for(int i=0; i<WordNumber.length; i++){
        if(max == WordNumber[i]){
            maxIndex += 1;
            
        }
    }
    String[] response = new String[2];
    String maxN = Integer.toString(max);

    response[0] = lista[9];
    response[1] = maxN;
    return response;
    }        
}

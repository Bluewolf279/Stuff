package com.bluewolf;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Matt on 6/08/2015.
 * Class use: This is the Binary encoder and decoder file
 */
public class Binary_encoder {
    public static String bEncoder(String text){
        String[] split = text.split("");
        String out ="";
        for (int i = 0;split.length > i;i++){
            if (Objects.equals(split[i], "A")){
                out+="01000001";
            }
            else if (Objects.equals(split[i], "B")){
                out+="01000010";
            }
            else if (Objects.equals(split[i], "C")){
                out+="01000011";
            }
            else if (Objects.equals(split[i], "D")){
                out+="01000100";
            }
            else if (Objects.equals(split[i], "E")){
                out+="01000101";
            }
            else if (Objects.equals(split[i], "F")){
                out+="01000110";
            }
            else if (Objects.equals(split[i], "G")){
                out+="01000111";
            }
            else if (Objects.equals(split[i], "H")){
                out+="01001000";
            }
            else if (Objects.equals(split[i], "I")){
                out+="01001001";
            }
            else if (Objects.equals(split[i], "J")){
                out+="01001010";
            }
            else if (Objects.equals(split[i], "K")){
                out+="01001011";
            }
            else if (Objects.equals(split[i], "L")){
                out+="01001100";
            }
            else if (Objects.equals(split[i], "M")){
                out+="01001101";
            }
            else if (Objects.equals(split[i], "N")){
                out+="01001110";
            }
            else if (Objects.equals(split[i], "O")){
                out+="01001111";
            }
            else if (Objects.equals(split[i], "P")){
                out+="01010000";
            }
            else if (Objects.equals(split[i], "Q")){
                out+="01010001";
            }
            else if (Objects.equals(split[i], "R")){
                out+="01010010";
            }
            else if (Objects.equals(split[i], "S")){
                out+="01010011";
            }
            else if (Objects.equals(split[i], "T")){
                out+="01010100";
            }
            else if (Objects.equals(split[i], "U")){
                out+="01010101";
            }
            else if (Objects.equals(split[i], "V")){
                out+="01010110";
            }
            else if (Objects.equals(split[i], "W")){
                out+="01010111";
            }
            else if (Objects.equals(split[i], "X")){
                out+="01011000";
            }
            else if (Objects.equals(split[i], "Y")){
                out+="01011001";
            }
            else if (Objects.equals(split[i], "Z")){
                out+="01011001";
            }
            else if (Objects.equals(split[i], "a")){
                out+="01100001";
            }
            else if (Objects.equals(split[i], "b")){
                out+="01100010";
            }
            else if (Objects.equals(split[i], "c")){
                out+="01100011";
            }
            else if (Objects.equals(split[i], "d")){
                out+="01100100";
            }
            else if (Objects.equals(split[i], "e")){
                out+="01100101";
            }
            else if (Objects.equals(split[i], "f")){
                out+="01100110";
            }
            else if (Objects.equals(split[i], "g")){
                out+="01100111";
            }
            else if (Objects.equals(split[i], "h")){
                out+="01101000";
            }
            else if (Objects.equals(split[i], "i")){
                out+="01101001";
            }
            else if (Objects.equals(split[i], "j")){
                out+="01101010";
            }
            else if (Objects.equals(split[i], "k")){
                out+="01101011";
            }
            else if (Objects.equals(split[i], "l")){
                out+="01101100";
            }
            else if (Objects.equals(split[i], "m")){
                out+="01101101";
            }
            else if (Objects.equals(split[i], "n")){
                out+="01101110";
            }
            else if (Objects.equals(split[i], "o")){
                out+="01101111";
            }
            else if (Objects.equals(split[i], "p")){
                out+="01110000";
            }
            else if (Objects.equals(split[i], "q")){
                out+="01110001";
            }
            else if (Objects.equals(split[i], "r")){
                out+="01110010";
            }
            else if (Objects.equals(split[i], "s")){
                out+="01110011";
            }
            else if (Objects.equals(split[i], "t")){
                out+="01110100";
            }
            else if (Objects.equals(split[i], "u")){
                out+="01110101";
            }
            else if (Objects.equals(split[i], "v")){
                out+="01110110";
            }
            else if (Objects.equals(split[i], "w")){
                out+="01110111";
            }
            else if (Objects.equals(split[i], "x")){
                out+="01111000";
            }
            else if (Objects.equals(split[i], "y")){
                out+="01111001";
            }
            else if (Objects.equals(split[i], "z")){
                out+="01111010";
            }
            else if (Objects.equals(split[i], " ")){
                out+="10100000";
            }
            else if (Objects.equals(split[i], "")){
                out+="";
            }
            else{
                out += split[i];
            }
        }
        return out;
    }
    public static String bDecoder(String code) {
        String text ="";
        List<String> subtext = new ArrayList<>();
        int index = 0;
        while (index < code.length()) {
            subtext.add(code.substring(index, Math.min(index + 8,code.length())));
            index += 8;
        }
        for (String texts : subtext) {
            if (Objects.equals(texts,"01000001")) {
                text +="A";
            }else if (Objects.equals(texts,"01000010")) {
                text +="B";
            }else if (Objects.equals(texts,"01000011")) {
                text +="C";
            }else if (Objects.equals(texts,"01000100")) {
                text +="D";
            }else if (Objects.equals(texts,"01000101")) {
                text +="E";
            }else if (Objects.equals(texts,"01000110")) {
                text +="F";
            }else if (Objects.equals(texts,"01000111")) {
                text +="G";
            }else if (Objects.equals(texts,"01001000")) {
                text +="H";
            }else if (Objects.equals(texts,"01001001")) {
                text +="I";
            }else if (Objects.equals(texts,"01001010")) {
                text +="J";
            }else if (Objects.equals(texts,"01001011")) {
                text +="K";
            }else if (Objects.equals(texts,"01001100")) {
                text +="L";
            }else if (Objects.equals(texts,"01001101")) {
                text +="M";
            }else if (Objects.equals(texts,"01001110")) {
                text +="N";
            }else if (Objects.equals(texts,"01001111")) {
                text +="O";
            }else if (Objects.equals(texts,"01010000")) {
                text +="P";
            }else if (Objects.equals(texts,"01010001")) {
                text +="Q";
            }else if (Objects.equals(texts,"01010010")) {
                text +="R";
            }else if (Objects.equals(texts,"01010011")) {
                text +="S";
            }else if (Objects.equals(texts,"01010100")) {
                text +="T";
            }else if (Objects.equals(texts,"01010101")) {
                text +="U";
            }else if (Objects.equals(texts,"01010110")) {
                text +="V";
            }else if (Objects.equals(texts,"01010111")) {
                text +="W";
            }else if (Objects.equals(texts,"01011000")) {
                text +="X";
            }else if (Objects.equals(texts,"01011001")) {
                text +="Y";
            }else if (Objects.equals(texts,"01011010")) {
                text +="Z";
            }else if (Objects.equals(texts,"10100000")) {
                text +=" ";
            }else if (Objects.equals(texts,"01100001")) {
                text +="a";
            }else if (Objects.equals(texts,"01100010")) {
                text +="b";
            }else if (Objects.equals(texts,"01100011")) {
                text +="c";
            }else if (Objects.equals(texts,"01100100")) {
                text +="d";
            }else if (Objects.equals(texts,"01100101")) {
                text +="e";
            }else if (Objects.equals(texts,"01100110")) {
                text +="f";
            }else if (Objects.equals(texts,"01100111")) {
                text +="g";
            }else if (Objects.equals(texts,"01101000")) {
                text +="h";
            }else if (Objects.equals(texts,"01101001")) {
                text +="i";
            }else if (Objects.equals(texts,"01101010")) {
                text +="j";
            }else if (Objects.equals(texts,"01101011")) {
                text +="k";
            }else if (Objects.equals(texts,"01101100")) {
                text +="l";
            }else if (Objects.equals(texts,"01101101")) {
                text +="m";
            }else if (Objects.equals(texts,"01101110")) {
                text +="n";
            }else if (Objects.equals(texts,"01101111")) {
                text +="o";
            }else if (Objects.equals(texts,"01110000")) {
                text +="p";
            }else if (Objects.equals(texts,"01110001")) {
                text +="q";
            }else if (Objects.equals(texts,"01110010")) {
                text +="r";
            }else if (Objects.equals(texts,"01110011")) {
                text +="s";
            }else if (Objects.equals(texts,"01110100")) {
                text +="t";
            }else if (Objects.equals(texts,"01110101")) {
                text +="u";
            }else if (Objects.equals(texts,"01110110")) {
                text +="v";
            }else if (Objects.equals(texts,"01110111")) {
                text +="w";
            }else if (Objects.equals(texts,"01111000")) {
                text +="x";
            }else if (Objects.equals(texts,"01111001")) {
                text +="y";
            }else if (Objects.equals(texts,"01111010")) {
                text +="z";
            }else if (Objects.equals(texts,"00110000")) {
                text +="0";
            }else if (Objects.equals(texts,"00110001")) {
                text +="1";
            }else if (Objects.equals(texts,"00110010")) {
                text +="2";
            }else if (Objects.equals(texts,"00110011")) {
                text +="3";
            }else if (Objects.equals(texts,"00110100")) {
                text +="4";
            }else if (Objects.equals(texts,"00110101")) {
                text +="5";
            }else if (Objects.equals(texts,"00110110")) {
                text +="6";
            }else if (Objects.equals(texts,"00110111")) {
                text +="7";
            }else if (Objects.equals(texts,"00111000")) {
                text +="8";
            }else if (Objects.equals(texts,"00111001")) {
                text +="9";
            }else if (Objects.equals(texts,"00111010")) {
                text +=":";
            }else if (Objects.equals(texts,"00111011")) {
                text +=";";
            }else if (Objects.equals(texts,"00100010")) {
                text +='"';
            }else if (Objects.equals(texts,"00100111")) {
                text +="'";
            }else if (Objects.equals(texts,"00111101")) {
                text +="=";
            }else if (Objects.equals(texts,"00101011")) {
                text +="+";
            }else if (Objects.equals(texts,"00111111")) {
                text +="?";
            }else if (Objects.equals(texts,"00101110")) {
                text +=".";
            }else if (Objects.equals(texts,"00101100")) {
                text +=",";
            }else if (Objects.equals(texts,"")) {
                text +="";
            }else if (Objects.equals(texts,"")) {
                text +="";
            }else if (Objects.equals(texts,"")) {
                text +="";
            }else if (Objects.equals(texts,"")) {
                text +="";
            }else if (Objects.equals(texts,"")) {
                text +="";
            }else if (Objects.equals(texts,"")) {
                text +="";
            }else if (Objects.equals(texts,"")) {
                text +="";
            }else if (Objects.equals(texts,"")) {
                text +="";
            }else if (Objects.equals(texts,"")) {
                text +="";
            }else if (Objects.equals(texts,"")) {
                text +="";
            }else if (Objects.equals(texts,"")) {
                text +="";
            }else if (Objects.equals(texts,"")) {
                text +="";
            }else if (Objects.equals(texts,"")) {
                text +="";
            }else if (Objects.equals(texts,"")) {
                text +="";
            }else if (Objects.equals(texts,"")) {
                text +="";
            }else if (Objects.equals(texts,"")) {
                text +="";
            }else if (Objects.equals(texts,"")) {
                text +="";
            }else if (Objects.equals(texts,"")) {
                text +="";
            }else if (Objects.equals(texts,"")) {
                text +="";
            }else if (Objects.equals(texts,"")) {
                text +="";
            }else if (Objects.equals(texts,"")) {
                text +="";
            }else if (Objects.equals(texts,"")) {
                text +="";
            }

        }
        return text;

    }


}

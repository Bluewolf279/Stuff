package com.bluewolf;

import java.util.Objects;

/**
 * Created by Matt on 6/08/2015.
 * Class use: This is the Binary encoder and decoder file
 */
public class Binary_encoder {
    public String bEncoder(String text){
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
            else if (Objects.equals(split[i], "")){
                out+="";
            }
            else{
                out += split[i];
            }
        }
        return out;
    }
}

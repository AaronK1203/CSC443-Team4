/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inclasssep22nd;

import java.util.ArrayList;
/**
 *
 * @author BLAZE
 */
public class PasswordValidator {
    
    public PasswordValidator(){
        
    }
    /**
     * If a password is valid, returns true
     * @param password String
     * @return isValid boolean
     */
    public boolean isValid(String password){
        //Attributes to validate
        boolean hasEightChars = false;
        
        //Test if password is at least 8 characters long
        if (password.length() >= 8){
            hasEightChars = true;
        }
        
        return hasEightChars;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package inclasssep22nd;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BLAZE
 */
public class PasswordValidatorTest {
    
    @Test
    public void passwordWithLessThanEightCharactersIsInvalid() {

        PasswordValidator validator = new PasswordValidator();

        assertFalse(validator.isValid("abcdefg"));
        assertTrue(validator.isValid("abcdefghijk"));
    }

    
    
}

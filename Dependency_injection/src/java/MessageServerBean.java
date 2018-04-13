/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danial
 */
import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Dependent
@Named
public class MessageServerBean {

    public String getMessage() {
        return "Welcome to Intellisoft!";
    }
}
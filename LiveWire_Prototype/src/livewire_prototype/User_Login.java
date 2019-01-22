/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livewire_prototype;

/**
 *
 * @author Chris Aiello G7244
 */
public class User_Login {
    protected String uName;
    protected String uPassword;

    public User_Login(String inputName, String inputPassword){
        this.uName = inputName;
        this.uPassword = inputPassword;
    }
    
    public String getName(){
        return uName;
    }
    public String getPass(){
        return uPassword;
    }
    
    public String getUserInfo(){
        return ("Username: "+uName+"\nPassword: "+uPassword);
    }

}

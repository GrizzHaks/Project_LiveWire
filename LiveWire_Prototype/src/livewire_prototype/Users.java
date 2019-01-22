/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livewire_prototype;
import java.text.NumberFormat;
/**
 *
 * @author Chris Aiello G7244
 */
public class Users {
    protected String name;
    protected String password;
    protected int balance;
    
    public Users(String input_name, String input_password, int input_balance){
        this.name = input_name;
        this.password = input_password;
        this.balance = input_balance;
    }
    
    public String getAccInfo(){
        NumberFormat numb = NumberFormat.getCurrencyInstance();
        return ("Name: "+name+
                "\nBalance in Account: "+numb.format(balance));
    }
    
    public String getName(){
        return name;
    }
    
    public String getPassword(){
        return password;
    }
    
    public int changeBal(){
        return balance;
    }
}

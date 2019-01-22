/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livewire_prototype;

import java.util.ArrayList;

/**
 *
 * @author Chris Aiello G7244
 */
public class UserDatabase{
    private int passiveUserCount, activeUserCount, capacity;
    protected ArrayList<Users> db = new ArrayList<Users>(capacity);
    protected ArrayList<User_Login> udb = new ArrayList<User_Login>(capacity);
    protected ArrayList<Users> printable = new ArrayList<Users>(capacity);
    
    public UserDatabase(){
        activeUserCount = 0;
        passiveUserCount = 0;
        capacity = 5; 
    }
    public void createAccount(String inputName, String inputPassword){
        User_Login ULN = new User_Login(inputName, inputPassword);
        udb.add(ULN);
        passiveUserCount++;
        
    }
    public void addUser(String input_name, String input_password, int input_balance){
        Users u = new Users(input_name, input_password, input_balance);
        db.add(u);
        activeUserCount++;
    }
    public int getCapacity(){
        return capacity;
    }
    
    public boolean validate(String UI, String PI){
        for (Users i: db){
            String EU = i.getName();
            String EP = i.getPassword();
            while (UI == EU && PI == EP){
                return true;
            }
        }
        return false;
    }
    
    public String toString(){
        System.out.println("Name\tBalance");
        String users = "";
        for (Users i: db){
            users = i.getAccInfo();
            System.out.println(users);
        }
        return users;
    }
}
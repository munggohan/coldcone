/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainProject;

/**
 *
 * @author Karuro
 */
public class LoginMethod {
    public String UserName;
    public String PassWord;
    
    public LoginMethod(String UserName, String PassWord){
        this.UserName = UserName;
        this.PassWord = PassWord;
    }
    
    public void setUserName(String UserName){
        this.UserName = UserName;
    }
    
    public String getUserName(){
        return UserName;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    public String getPassWord() {
        return PassWord;
    }
}

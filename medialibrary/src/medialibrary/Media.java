/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medialibrary;

/**
 *
 * @author 16007873
 */
public class Media {
    private String mName = "";
    private String mDescription = "";
    
    Media(String newmName, String newmDescription){
        
    }

    public String getmName(){
        return mName;
    }    
    public String getmDescription(){
        return mDescription;
    }
    public void setmName(String newmName){
        mName = newmName;
    }
    public void setmDescription(String newmDescription){
        mDescription = newmDescription;
    }

}


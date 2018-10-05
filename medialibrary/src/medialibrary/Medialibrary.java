/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medialibrary;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author 16007873
 */
public class MediaLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MediaLib library = new MediaLib();
    }
    
        
//    String[] Media = new String[4];
    ArrayList<String> Media=new ArrayList<String>();
    
    public void addMedia(String newMedia){
//        for(int i=0;i<Media.length;i++){
//            Media[i]=newMedia;
//        }
        Media.add(newMedia);
        Collections.sort(Media);
    }
    
    public void printMedia(){
        System.out.println(Media);
    }
    
    public void findMedia(String searchName){
        boolean Found = Media.contains(searchName);
    }
    
    
}

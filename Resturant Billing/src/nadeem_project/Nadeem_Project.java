/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nadeem_project;

/**
 *
 * @author heena sharma
 */
public class Nadeem_Project 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try{
            for(javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        Loading l = new Loading();
        l.setVisible(true);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeRestrCampo;

/**
 *
 * @author PAULO
 */

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
public class LimitarDigitos extends PlainDocument{
   private int quantidadeMax;
   public LimitarDigitos(int maxLen){
       super();
       if(maxLen<=0)
           throw new IllegalArgumentException("Especifique a Quantidade!");
           quantidadeMax = maxLen;
       
   }
   @Override
   public void insertString(int offset,String str,AttributeSet attr)
       throws BadLocationException{
       if(str==null||getLength()==quantidadeMax)
           return;
       int totalquant = (getLength() + str.length());
       if(totalquant<=quantidadeMax){
           super.insertString(offset, str.replaceAll("[^a-zA-Z|^0-9] *@",""), attr);
           return;
       }
       String nova = str.substring(0,getLength()+quantidadeMax);
       super.insertString(offset, nova, attr);
   }
       
   
}

package bj.tipos.clases;

import java.io.*;
import java.util.List;

import com.google.common.collect.Lists;
 
class ReadFile {
	
	public static List<String> Read(){
		List<String> res = Lists.newArrayList();
		 File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	 
	      try {
	         archivo = new File ("C:\\Users\\JuanRamón\\AppData\\Local\\WoWServerApp\\Directories.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	 
	         //Read file
	         String linea;
	         while((linea=br.readLine())!=null)
	            res.add(linea);
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
		return res;
	}
	
	public static String AuthServer(){
		return Read().size()>=1?Read().get(1):"";
	}
	
	public static String WorldServer(){
		return Read().size()>=3?Read().get(3):"";
	}
	
	public static String WoW(){
		return Read().size()>=5?Read().get(5):"";
	}
	
   public static void main(String [] arg) {
	   System.out.println(AuthServer());
	   System.out.println(WorldServer());
	   System.out.println(WoW());
   }
}
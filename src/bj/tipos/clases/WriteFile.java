package bj.tipos.clases;

import java.io.*;

public class WriteFile{
	
	public static void Write(){
			FileWriter fichero = null;
	        PrintWriter pw = null;
	        File directorio = new File("C:\\Users\\JuanRamón\\AppData\\Local\\WoWServerApp");
	        try{
	        	boolean a = directorio.mkdir();
	        	fichero = new FileWriter("C:\\Users\\JuanRamón\\AppData\\Local\\WoWServerApp\\Directories.txt");
	            String AuthServer = PreferenceAction.getAuthServer();
	            String WorldServer = PreferenceAction.getWorldServer();
	            String WoW = PreferenceAction.getWoWGame();
	            
	            //Delete content of file
	            fichero.write("");
	            pw = new PrintWriter(fichero);
	            
	            //Write File
	            pw.println("***AUTHSERVER.EXE***");
	            pw.println(AuthServer);
	            pw.println("***WORLDSERVER.EXE***");
	            pw.println(WorldServer);
	            pw.println("***WOW.EXE***");
	            pw.println(WoW);
	            System.out.println(a);
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           try {
	           if (null != fichero)
	              fichero.close();
	           } catch (Exception e2) {
	              e2.printStackTrace();
	           }
	        }
	}
}
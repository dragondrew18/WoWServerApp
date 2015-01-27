package bj.tipos.clases;

import java.io.File;

public class CreateDirectory {

	public static void Create(){
	        File directorio = new File("C:\\Users\\JuanRamón\\AppData\\Local\\WoWServerApp");
	        directorio.mkdir();
	}
}

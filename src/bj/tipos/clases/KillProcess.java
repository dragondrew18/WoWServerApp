package bj.tipos.clases;

import java.io.IOException;

public class KillProcess {
	
	public static void cerrarAuthServer() {
		 String cmd =  "";
			cmd+="tskill authserver";
		 Process hijo;
		 try {
			hijo = Runtime.getRuntime().exec(cmd);
			hijo.waitFor();
		 } catch (IOException e) {
			System.out.println("Incapaz de matar WoW.exe.");
		 } catch (InterruptedException e) {
			System.out.println("Incapaz de matar WoW.exe.");
		 }
		}
	
	public static void cerrarWorldServer() {
		 String cmd =  "";
			cmd+="tskill worldserver";
		 Process hijo;
		 try {
			hijo = Runtime.getRuntime().exec(cmd);
			hijo.waitFor();
		 } catch (IOException e) {
			System.out.println("Incapaz de matar WoW.exe.");
		 } catch (InterruptedException e) {
			System.out.println("Incapaz de matar WoW.exe.");
		 }
		}

	public static void cerrarWoW() {
		 String cmd =  "";
			cmd+="tskill wow";
		 Process hijo;
		 try {
			hijo = Runtime.getRuntime().exec(cmd);
			hijo.waitFor();
		 } catch (IOException e) {
			System.out.println("Incapaz de matar WoW.exe.");
		 } catch (InterruptedException e) {
			System.out.println("Incapaz de matar WoW.exe.");
		 }
		}
	
	public static void main(String[] args) {
		cerrarAuthServer();
		cerrarWorldServer();
		cerrarWoW();
	}
}

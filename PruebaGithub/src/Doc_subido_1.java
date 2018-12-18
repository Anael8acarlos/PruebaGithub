


	
		import java.io.BufferedReader;
		import java.io.FileWriter;
		import java.io.IOException;
		import java.io.InputStreamReader;
		import java.io.PrintWriter;
				
		public class Doc_subido_1 {
					public static void main(String[] args) {

					try {
						FileWriter archivo = new FileWriter("C:\\Users\\propietario\\Documents.txt", true);
						PrintWriter escribir = new PrintWriter(archivo);
						
						String dato;
						
						BufferedReader bf=new BufferedReader(new InputStreamReader (System.in));
								
							do {
								System.out.println("dn1");
								String dn1 = bf.readLine();
								
								System.out.println("nombre");
								String nombre = bf.readLine();
								
								System.out.println("Direccion");
								String direccion = bf.readLine();
								
								String cad = dn1 + "/" + nombre + "/" + direccion;
								
								escribir.println(cad);
								
								
								System.out.println("Quiere escribir un dato si -- no");
								dato=bf.readLine();
							}while("si".equals(dato));
						
							archivo.close();	 
							
					}catch(IOException e){
						
						e.printStackTrace();
						
					}
					}

			

	}



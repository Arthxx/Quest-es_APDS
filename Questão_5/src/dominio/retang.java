package dominio;

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	
	public class retang {

		public int A1, B1, C1, D1, A2, B2, C2, D2;
		
		public void Colis() {
			String path = "C:\\Users\\luiza\\OneDrive\\Documentos\\APDS\\Q5_APDS_Luiz_Artur.txt";
			try (BufferedReader br = new BufferedReader(new FileReader(path))){
				String line = br.readLine();
				
				
				while ((line) != null) {
					
					String[] l = line.split(" ");
					A1 = Integer.parseInt(l[0]);
					B1 = Integer.parseInt(l[1]);
					C1 = Integer.parseInt(l[2]);
					D1 = Integer.parseInt(l[3]);
					
					line = br.readLine();
					String[] a = line.split(" ");
					A2 = Integer.parseInt(a[0]);
					B2 = Integer.parseInt(a[1]);
					C2 = Integer.parseInt(a[2]);
					D2 = Integer.parseInt(a[3]);
					
					
					if (C1 < A2 || C2 < A1 || D1 < B2 || D2 < B1 || A1 > C2 || A2 > C1 || B1 > D2 || B2 > D1) {
						System.out.println("Não Colidiu (0)");
					}else {
						System.out.println("Colidiu (1)");
					}
					
				}
			}catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

	}

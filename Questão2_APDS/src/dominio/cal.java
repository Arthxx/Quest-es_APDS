package dominio;
	import java.time.LocalDate;
	import java.time.Period;
	import java.util.ArrayList;
	import java.util.Scanner;

	public class cal {
		public cal(){
			try (Scanner input = new Scanner(System.in)) {
				ArrayList <pessoa> Job = new ArrayList<pessoa>();
				pessoa a = new pessoa();
				
				
				System.out.println("Insira o nome do Funcion�rio:");
				a.setNome(input.nextLine());
				System.out.println("Qual a empresa que o funcion�rio trabalha?");
				a.setCompania(input.nextLine());
				System.out.println("Qual o dia de Admiss�o?");
				a.setDia1(input.nextInt());
				System.out.println("Qual o m�s de Admiss�o?");
				a.setMes1(input.nextInt());
				System.out.println("Qual o ano de Admiss�o?");
				a.setAno1(input.nextInt());
				System.out.println("Qual o dia de Demiss�o?");
				a.setDia2(input.nextInt());
				System.out.println("Qual o m�s de Demiss�o?");
				a.setMes2(input.nextInt());
				System.out.println("Qual o ano de Demiss�o?");
				a.setAno2(input.nextInt());
				Job.add(a);
				
				
				for (int i = 0; i < Job.size(); i++ ) {
					LocalDate DateA = LocalDate.of(Job.get(i).ano1, Job.get(i).Mes1, Job.get(i).Dia1);
					LocalDate DateB = LocalDate.of(Job.get(i).ano2, Job.get(i).Mes2, Job.get(i).Dia2);
					Period JobTime = Period.between(DateA, DateB);
					int ano, Mes, Dia;
					ano = JobTime.getYears();
					Mes = JobTime.getMonths();
					Dia = JobTime.getDays();
					
					System.out.println(Job.get(i).getNome() + " Trabalhou na empresa " + Job.get(i).getCompania() + " por " + ano + " anos, " + Mes + " meses e " + Dia + " dias \n");
				}
			}
		}

		public void cal1() {
			// TODO Auto-generated method stub
			
		}
}

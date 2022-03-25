import java.sql.SQLException;
import java.util.Scanner;
import java.io.IOException;

public class AgenciaDaRo {

	private static Process exec;

	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub
			
		int valor = 0;

		System.out.println("=============================================");
		System.out.println("=============== Agencia da Ro ===============");
		System.out.println("    Planeje sua viagem com comodidade!");
		System.out.println("=============================================");
		while(true) {
			if(valor == 3) {
				break;
			}
		System.out.println("[ 1 ] - Registrar uma mensagem para Ro");
		System.out.println("[ 2 ] - Consultar os destinos da RO");
		System.out.println("[ 3 ] - Sair da Agencia");
		System.out.println("==============================================");
		Scanner entrada2 = new Scanner(System.in);
		valor = entrada2.nextInt();
		switch(valor) {
			case 1:
			Contato contato = new Contato();
			break;
			case 2:
			Destinos destino = new Destinos();
			break;		
		}
		
		}
		
		
	}

}

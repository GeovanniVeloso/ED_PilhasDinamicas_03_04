package view;

import javax.swing.JOptionPane;

import controller.NPRController;

public class Principal {

	public static void main(String[] args) throws Exception {
		NPRController NPR = new NPRController();
		int n = 0;
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para somar valores a pilha e 2 para efeturar as operações.( Digite 0 para finalizar"));
			switch (n){
			case 1:
				NPR.insereValor();
				break;
			case 2:
				NPR.npr();
				break;
			case 0:
				System.out.println("Finalizando...");
			default:
				System.out.println("Opção não encontrada");
			}
		}while(n!=0);
	}

}

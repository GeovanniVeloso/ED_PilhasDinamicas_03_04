package controller;

import javax.swing.JOptionPane;
import model.PlhaInt;

public class NPRController {
PlhaInt p = new PlhaInt();
	public NPRController() {
		super();
	}
	
	public void insereValor () {
		int n = 0;
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor desejado (Digite 0 para encerrar)"));
			if(n!=0) {
				p.push(n);
			}
		}while(n!=0);
	}
	
	public void npr() throws Exception {
		String op = "0";
		int pri = 0;
		int seg = 0;
		int res = 0;
		
		op = JOptionPane.showInputDialog("Insira o operador.");
			switch (op) {
				case "+":
					if(p.size()>=2) {
						pri = p.pop();
						seg = p.pop();
						res = seg + pri;
						System.out.println("A soma de "+seg+" com "+pri+" � igual a "+res);
						p.push(res);
					}else {
						System.out.println("O vetor n�o tem valores sufucientes para ser efetuado o calculado");
					}
					break;
				case "-":
					if(p.size()>=2) {
						pri = p.pop();
						seg = p.pop();
						res = seg - pri;
						System.out.println("A subtra��o de "+seg+" com "+pri+" � igual a "+ res);
						p.push(res);
					}else {
						System.out.println("O vetor n�o tem valores sufucientes para ser efetuado o calculado");
					}
					break;
				case "*":
					if(p.size()>=2) {
						pri = p.pop();
						seg = p.pop();
						res = seg * pri;
						System.out.println("A multiplica��o de "+seg+" com "+pri+" � igual a "+res);
						p.push(res);
					}else {
						System.out.println("O vetor n�o tem valores sufucientes para ser efetuado o calculado");
					}
					break;
				case "/":
					if(p.size()>=2) {
						pri = p.pop();
						seg = p.pop();
						res = seg / pri;
						System.out.println("A divis�o de "+seg+" com "+pri+" � igual a "+res);
						p.push(res);
					}else {
						System.out.println("O vetor n�o tem valores sufucientes para ser efetuado o calculado");
					}
					break;
				default:
					System.out.println("Op��o n�o encontrada");
			}
	}
}

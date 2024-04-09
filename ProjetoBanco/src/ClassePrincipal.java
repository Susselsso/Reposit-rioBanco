
public class ClassePrincipal {

	public static void main(String[] args) {
		
		ClasseConta objeto_conta_um; // Criou a variável
		objeto_conta_um = new ClasseConta(); // Instanciou o objeto
		
		ClasseConta objeto_conta_dois = new ClasseConta(); // Criou a variável & Instanciou o objeto (inline).
		
		System.out.println(objeto_conta_um.atributoNumeroConta);
		System.out.println(objeto_conta_um.atributoSaldoConta);
		System.out.println(objeto_conta_um.atributoTipoConta);
		
		
		System.out.println(objeto_conta_dois.atributoNumeroConta);
		System.out.println(objeto_conta_dois.atributoSaldoConta);
		System.out.println(objeto_conta_dois.atributoTipoConta);
		
		//Adicionado dados das contas.
		objeto_conta_um.atributoNumeroConta = 123;
		objeto_conta_um.atributoSaldoConta = 2_600.00F;
		objeto_conta_um.atributoTipoConta = "Conta Poupança";
		
		objeto_conta_dois.atributoNumeroConta = 789;
		objeto_conta_dois.atributoSaldoConta = 4_000.00F;
		objeto_conta_dois.atributoTipoConta = "Conta corrente";
		
		System.out.println();
		
		System.out.println(objeto_conta_um.atributoNumeroConta);
		System.out.println(objeto_conta_um.atributoSaldoConta);
		System.out.println(objeto_conta_um.atributoTipoConta);
		
		
		System.out.println(objeto_conta_dois.atributoNumeroConta);
		System.out.println(objeto_conta_dois.atributoSaldoConta);
		System.out.println(objeto_conta_dois.atributoTipoConta);
		
		objeto_conta_um.atributoPessoa = new ClassePessoa(); // Inst
		
		objeto_conta_um.atributoPessoa.atributoNomePessoa = "Fulano";
		objeto_conta_um.atributoPessoa.atributoDocumentoPessoa = 333;
		
		objeto_conta_dois.atributoPessoa = new ClassePessoa(); // Inst
		
		objeto_conta_dois.atributoPessoa.atributoNomePessoa = "Ciclano";
		objeto_conta_dois.atributoPessoa.atributoDocumentoPessoa = 444;
		
		objeto_conta_um.metodoDepositar(500.00F);
		
		System.out.println(objeto_conta_um.atributoSaldoConta);
		
		objeto_conta_um.metodoSacar(4_000);
		System.out.println(objeto_conta_um.atributoSaldoConta);
		
		
		objeto_conta_um.metodoTransferir(500.00F, objeto_conta_um,objeto_conta_dois);
	}

}

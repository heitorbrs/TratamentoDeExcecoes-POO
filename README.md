## TratamentoDeExcecoes-POO

1. Implemente uma classe ContaBancaria. Esta classe deve ter como
atributo interno a informação sobre o saldo do ContaBancaria
(considere um valor double), o nome do proprietário da conta e um
limite de crédito.



2. Implemente, além dos necessários métodos construtores, um método
Depositar, um método Sacar, um método para informar o saldo atual
e demais métodos necessários. Garanta, utilizando mecanismo de
exceção, que não será depositado um valor negativo na conta para
depósito, utilizando a exceção IllegalArgumentException. Já para o
método sacar, garanta que não seja retirado um valor além do limite
da conta com EstouroDeLimiteException e, também, que não seja
informado um saque negativo, utilizando a
IllegalArgumentException.



3. Crie um classe principal (Sistema) e no main crie um objeto da classe
ContaBancaria solicite ao usuário o nome do correntista e qual será
o seu limite.



4. Depois, enquanto o usuário desejar, solicite qual operação ele deseja
realizar (depósito, saque, saldo ou sair). Realize o tratamento de
exceções correspondente a cada operação realizada.

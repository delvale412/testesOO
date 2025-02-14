class Pagamento {

    public static void realizarPagamento(Consulta consulta, double valorPago) {
        if (consulta == null) {
            throw new IllegalArgumentException("Consulta não encontrada.");
        }

        double valorConsulta = Double.parseDouble(consulta.getValor());

        // Verifica se o valor pago é suficiente
        if (valorPago >= valorConsulta) {
            consulta.pagar();  // Marca a consulta como paga
            System.out.println("Pagamento realizado com sucesso! Status da consulta: " + consulta.getStatus());
        } else {
            consulta.pendente();  // Marca a consulta como pendente
            System.out.println("Pagamento insuficiente. Status da consulta: " + consulta.getStatus());
        }
    }
}

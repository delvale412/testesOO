public class PrincipalConsulta {

    public static void main(String[] args) {
        // Criando uma consulta
        Consulta consulta = new Consulta("2025-02-15", "10:00", "João da Silva", "Dr. Carlos", "Agendada", "150.00");

        // Criando medicamentos
        Medicamento medicamento1 = new Medicamento("Amoxicilina", "500mg", 30, "Tomar 1 comprimido a cada 8 horas");
        Medicamento medicamento2 = new Medicamento("Paracetamol", "750mg", 20, "Tomar 1 comprimido a cada 6 horas, se necessário");

        // Prescrevendo medicamentos para a consulta
        consulta.getPrescricao().prescreverMedicamento(medicamento1);
        consulta.getPrescricao().prescreverMedicamento(medicamento2);

        // Exibindo os medicamentos prescritos
        consulta.getPrescricao().exibirMedicamentos();

        // Realizar o pagamento da consulta
        try {
            // Pagamento suficiente
            Pagamento.realizarPagamento(consulta, 150.00);
            // Pagamento insuficiente (descomente para testar)
            // Pagamento.realizarPagamento(consulta, 100.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao realizar o pagamento: " + e.getMessage());
        }

        // Exibindo novamente o status após o pagamento
        System.out.println("Status final da consulta: " + consulta.getStatus());
    }
}

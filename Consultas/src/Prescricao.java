public class Prescricao {
    private List<Medicamento> medicamentos;

    public Prescricao() {
        this.medicamentos = new ArrayList<>();
    }

    public void prescreverMedicamento(Medicamento medicamento) {
        this.medicamentos.add(medicamento);
    }

    public void exibirMedicamentos() {
        if (medicamentos.isEmpty()) {
            System.out.println("Nenhum medicamento prescrito.");
        } else {
            System.out.println("Medicamentos prescritos:");
            for (Medicamento medicamento : medicamentos) {
                medicamento.exibirInformacoes();
            }
        }
    }
}
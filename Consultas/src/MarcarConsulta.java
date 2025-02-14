public class MarcarConsulta {

    public static Consulta agendarConsulta(String data, String horario, String paciente, String medico,
                                           String status, String exames, String medicamentos, String valor) {
        if (data == null || data.isBlank()) {
            throw new IllegalArgumentException("A data é obrigatória.");
        }
        if (horario == null || horario.isBlank()) {
            throw new IllegalArgumentException("O horário é obrigatório.");
        }
        if (paciente == null || paciente.isBlank()) {
            throw new IllegalArgumentException("O paciente é obrigatório.");
        }
        if (medico == null || medico.isBlank()) {
            throw new IllegalArgumentException("O médico é obrigatório.");
        }

        if (status == null || status.isBlank()) {
            status = "Agendada"; // Status padrão
        }

        return new Consulta(data, horario, paciente, medico, status, exames, medicamentos, valor);
    }
}

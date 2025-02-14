package Consultas;

import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {
    private final LocalDate data;
    private final LocalTime horario;
    private String status;
    private final String paciente;
    private final String medico;

    public Consulta(String data, String horario, String status, String paciente, String medico) {
        this.data = LocalDate.parse(data);
        this.horario = LocalTime.parse(horario);
        this.status = status;
        this.paciente = paciente;
        this.medico = medico;
    }

    public LocalDate getData() { return data; }
    public LocalTime getHorario() { return horario; }
    public String getStatus() { return status; }
    public String getPaciente() { return paciente; }
    public String getMedico() { return medico; }
    public void atualizarStatus(String novoStatus) { this.status = novoStatus; }

    @Override
    public String toString() {
        return String.format("Consulta [Data: %s, Horário: %s, Status: %s, Paciente: %s, Médico: %s]",
                data, horario, status, paciente, medico);
    }
}

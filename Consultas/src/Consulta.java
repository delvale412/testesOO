import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Consulta {
    private LocalDate data;
    private LocalTime horario;
    private String paciente;
    private String medico;
    private String status;
    private BigDecimal valor;
    private boolean pago;
    private Prescricao prescricao;

    public Consulta(String data, String horario, String paciente, String medico, String status, String valor) {
        this.data = LocalDate.parse(data);
        this.horario = LocalTime.parse(horario);
        this.paciente = paciente;
        this.medico = medico;
        this.status = status;
        this.valor = new BigDecimal(valor);
        this.pago = false;
        this.prescricao = new Prescricao();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public boolean isPago() {
        return pago;
    }

    public void pagar() {
        this.pago = true;
        this.status = "Paga";
    }

    public void pendente() {
        this.pago = false;
        this.status = "Pendente";
    }

    public String getStatus() {
        return this.status;
    }

    public Prescricao getPrescricao() {
        return prescricao;
    }
}
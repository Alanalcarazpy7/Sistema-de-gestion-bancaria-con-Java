package primer_final;

public class Deposito extends Transaccion {
    private double monto_deposito;
    private Cuenta cuenta_destino;

    // Constructor
    public Deposito(int Id_transaccion, int Pin_transaccion, String Tipo_transaccion,
            String Fecha_transaccion,double monto_deposito, Cuenta cuenta_destino) {
        // Llamada al constructor de la clase base (Transaccion)
        super(Id_transaccion, Pin_transaccion, Tipo_transaccion, Fecha_transaccion);
        
        this.monto_deposito = monto_deposito;
        this.cuenta_destino = cuenta_destino;
    }

    // Métodos getter y setter para monto_deposito
    public double getMonto_deposito() {
        return monto_deposito;
    }

    public void setMonto_deposito(double monto_deposito) {
        this.monto_deposito = monto_deposito;
    }

    // Métodos getter y setter para cuenta_destino
    public Cuenta getCuenta_destino() {
        return cuenta_destino;
    }

    public void setCuenta_destino(Cuenta cuenta_destino) {
        this.cuenta_destino = cuenta_destino;
    }
}

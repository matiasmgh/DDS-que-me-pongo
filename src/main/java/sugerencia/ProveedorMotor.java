package sugerencia;

public class ProveedorMotor {
  private static ProveedorMotor INSTANCE = null;
  private static MotorSugerencias motor;

  private ProveedorMotor() {

  }

  public static ProveedorMotor getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new ProveedorMotor();
    }
    return ProveedorMotor.INSTANCE;
  }

  public MotorSugerencias getMotor() {
    return motor;
  }

  public void setMotor(MotorSugerencias motor) {
    ProveedorMotor.motor = motor;
  }
}

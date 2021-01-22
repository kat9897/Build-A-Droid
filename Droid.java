public class Droid {
  int batteryLevel;
  String name;

  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }
  public String toString() {
    return "Hello, I'm the droid: " + name;
  }
  public void performTask(String task) {
    System.out.println(name + "is performing task: " + task);
    batteryLevel -= 10;
  }
  public void energyReport() {
    System.out.println("Battery Level: " + batteryLevel);
  }


  public static void main(String[] args) {
    Droid Codey = new Droid("Codey");
    Droid Margaret = new Droid("Margaret");
    System.out.println(Codey);
    Codey.performTask("swim");
   Codey.energyReport();
   System.out.println(Margaret);
   Margaret.energyReport();
   Margaret.performTask("fly");
   Margaret.energyReport();
  }
}

// Фасад
class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;
    private SubsystemC subsystemC;

    public Facade() {
        this.subsystemA = new SubsystemA();
        this.subsystemB = new SubsystemB();
        this.subsystemC = new SubsystemC();
    }

    public void operation() {
        System.out.println("Facade operation");
        subsystemA.operationA();
        subsystemB.operationB();
        subsystemC.operationC();
    }
}
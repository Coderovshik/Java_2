public class PrototypeExample {
    // Интерфейс прототипа
    interface Prototype {
        Prototype clone();
    }

    // Конкретная реализация прототипа
    class ConcretePrototype implements Prototype {
        private String field;

        public ConcretePrototype(String field) {
            this.field = field;
        }

        public void setField(String field) {
            this.field = field;
        }

        public String getField() {
            return field;
        }

        @Override
        public Prototype clone() {
            return new ConcretePrototype(this.field);
        }
    }

    // Пример использования паттерна Прототип
    public class Example {
        public void Run(String[] args) {
            ConcretePrototype original = new ConcretePrototype("original object");
            ConcretePrototype clone = (ConcretePrototype) original.clone();

            System.out.println("Original object field: " + original.getField());
            System.out.println("Cloned object field: " + clone.getField());

            // Меняем поле у клонированного объекта
            clone.setField("cloned object");
            System.out.println("Original object field after clone modification: " + original.getField());
            System.out.println("Cloned object field after modification: " + clone.getField());
        }
    }

}

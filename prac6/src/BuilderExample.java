public class BuilderExample {
    // Продукт, который мы хотим построить
    class Product {
        private String part1;
        private String part2;

        public void setPart1(String part1) {
            this.part1 = part1;
        }

        public void setPart2(String part2) {
            this.part2 = part2;
        }

        public void show() {
            System.out.println("Part 1: " + part1);
            System.out.println("Part 2: " + part2);
        }
    }

    // реализация строителя
    class Builder {
        private Product product = new Product();

        public Builder buildPart1() {
            product.setPart1("Part 1 built");
            return this;
        }

        public Builder buildPart2() {
            product.setPart2("Part 2 built");
            return this;
        }

        public Product getResult() {
            return product;
        }
    }

    // Пример использования паттерна Строитель
    public class Example {
        public void Run(String[] args) {
            Builder builder = new Builder();

            Product product = builder
            .buildPart1()
            .buildPart2()
            .getResult();
            
            product.show();
        }
    }

}

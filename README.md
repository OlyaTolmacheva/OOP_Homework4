# SOLID
## S - SRP (Принцип единственной ответственности)
Каждый класс должен иметь только одну ответственность.
На примере кода ДЗ к семинару 4 этот принцип соблюдается в нескольких классах (например, Teacher, Student), где каждый их этих классов выполняет задачи по "обслуживанию" только данного класса (конструктор, Getter и Setter, метод toString).
## O - OCP (Принцип открытости/закрытости)
Классы должны быть открыты для расширения и одновременно закрыты для модификации.
Пример из ДЗ - классы Student, Teacher, StudentGroup расширяют класс User, но не изменяют его внутреннюю реализацию.
## L - LSP (Принцип подстановки Лисков)
Класс-наследник не должен делать меньше, чем класс-родитель.
Пример из ДЗ - класс Student имеет дополнительные св-ва, которых нет у класса родителя User, а также переписывают под себя метод toString.
## I - ISP (Принцип разделения интерфейса)
Не должны быть реализованы интерфейсы, которые не используются.
## D - DIP (Принцип инферсии зависимостей)
Модули высокого уровня не должны зависеть от модулей нижнего уровня.
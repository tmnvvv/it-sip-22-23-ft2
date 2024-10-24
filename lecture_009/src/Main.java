/*
    Паттерн Bridge (Handle, Body - Описатель, Тело) - позволяет отделить абстракцию от
    элементов ее реализации так, чтобы и абстракцию и реализацию можно было изменять независимо
    друг от друга.

    Отделяет абстракцию от реализации.


 */


void main() {
    Abstraction abstraction = new RefinedAbstraction(new ConcreteImplementationA());
    abstraction.operation();

    abstraction = new RefinedAbstraction(new ConcreteImplementationB());
    abstraction.operation();
}
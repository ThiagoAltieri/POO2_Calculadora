public class Calculadora<T extends Number> {

    public T somar(T num1, T num2) {
        double soma = num1.doubleValue() + num2.doubleValue();

        if (num1 instanceof Integer) {
            return (T) Integer.valueOf((int) soma);
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(soma);
        } else if (num1 instanceof Float) {
            return (T) Float.valueOf((float) soma);
        } else if (num1 instanceof Long) {
            return (T) Long.valueOf((long) soma);
        } else if (num1 instanceof Short) {
            return (T) Short.valueOf((short) soma);
        } else if (num1 instanceof Byte) {
            return (T) Byte.valueOf((byte) soma);
        } else {
            throw new IllegalArgumentException("Tipo de número não suportado");
        }
    }
}
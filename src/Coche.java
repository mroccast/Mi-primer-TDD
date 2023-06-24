public class Coche {
    public int velocidad;

    public void acelerar_mariateresa_rocamora(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerar_mariateresa_rocamora(int deceleracion) {
        velocidad -= deceleracion;
        if (velocidad <0) velocidad = 0;
    }
}

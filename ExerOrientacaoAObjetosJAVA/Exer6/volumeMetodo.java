package ExerOrientacaoAObjetosJAVA.Exer6;

public class volumeMetodo {
    private static double volume = 1890;

    public static double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        volumeMetodo.volume = volume;
    }

    public static double paraLitros() {
        return getVolume() * 1000;
    }

    public static double paraPesCubicos() {
        return getVolume() * 32.35;
    }

    public static double paraCentimetrosCubicos() {
        return getVolume() * 1000000;
    }
}


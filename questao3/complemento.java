package questao3;

public abstract class complemento implements bebida {
    protected final bebida base;

    protected complemento(bebida base) {
        this.base = base;
    }
}

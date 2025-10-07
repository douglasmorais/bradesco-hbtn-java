public interface CanalNotificacao {
    default void notificar(Mensagem mensagem) {
        System.out.println("{LOG}");
    }
}

public class Email implements CanalNotificacao {
    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("[EMAIL] {%s} - %s%n", mensagem.getTipoMensagem(), mensagem.getTexto());
    }
}

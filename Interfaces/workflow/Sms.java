public class Sms implements CanalNotificacao {
    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("[SMS] {%s} - %s%n", mensagem.getTipoMensagem(), mensagem.getTexto());
    }
}

public class Slack implements CanalNotificacao {
    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("[SLACK] {LOG} - " + mensagem.getTipoMensagem() + " - " + mensagem.getTexto());
    }
}

public class Teams implements CanalNotificacao {
    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("[TEAMS] {LOG} - " + mensagem.getTipoMensagem() + " - " + mensagem.getTexto());
    }
}

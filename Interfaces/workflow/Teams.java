public class Teams implements CanalNotificacao {
    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("[TEAMS] {%s} - %s%n", mensagem.getTipoMensagem(), mensagem.getTexto());
    }
}

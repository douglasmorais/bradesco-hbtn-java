public class Program {
    public static void main(String[] args) {
        workflow.ProcessadorVideo processadorVideo1 = new workflow.ProcessadorVideo();
        processadorVideo1.registrarCanal(new workflow.Slack());
        processadorVideo1.registrarCanal(new workflow.Teams());

        workflow.ProcessadorVideo processadorVideo2 = new workflow.ProcessadorVideo();
        processadorVideo2.registrarCanal(new workflow.Slack());
        processadorVideo2.registrarCanal(new workflow.Email());

        workflow.ProcessadorVideo processadorVideo3 = new workflow.ProcessadorVideo();
        processadorVideo3.registrarCanal(new workflow.Sms());

        workflow.ProcessadorVideo processadorVideo4 = new workflow.ProcessadorVideo();

        workflow.ProcessadorVideo processadorVideo5 = new workflow.ProcessadorVideo();
        processadorVideo5.registrarCanal(new workflow.Sms());
        processadorVideo5.registrarCanal(new workflow.Slack());
        processadorVideo5.registrarCanal(new workflow.Email());
        processadorVideo5.registrarCanal(new workflow.Teams());

        workflow.Video video1 = new workflow.Video("video1.mpg", workflow.FormatoVideo.MPEG);
        workflow.Video video2 = new workflow.Video("video2.avi", workflow.FormatoVideo.AVI);
        workflow.Video video3 = new workflow.Video("video3.mkv", workflow.FormatoVideo.MKV);

        processadorVideo1.processar(video1);

        System.out.println();

        processadorVideo2.processar(video1);

        System.out.println();

        processadorVideo3.processar(video2);

        System.out.println();

        processadorVideo4.processar(video3);

        System.out.println();

        processadorVideo5.processar(video3);
    }
}

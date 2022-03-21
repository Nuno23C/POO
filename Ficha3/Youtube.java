import java.time.LocalDate;
import java.util.ArrayList;

public class Youtube {
    private String name;
    private String content;
    private LocalDate uploadDate;
    private int resolution;
    private int durationMin;
    private int durationSec;
    private ArrayList<String> coments;
    private int likes;
    private int dislikes;

    public Youtube() {
        this.name = "none";
        this.content = "none";
        this.uploadDate = LocalDate.now();
        this.resolution = 0;
        this.durationMin = 0;
        this.durationSec = 0;
        this.coments = new ArrayList<>();
        this.likes = 0;
        this.dislikes = 0;
    }

    public Youtube(String name, String content, LocalDate date, int resolution, int durationMin, int durationSec, ArrayList<String> coments, int likes, int dislikes) {
        this.name = name;
        this.content = content;
        this.uploadDate = date;
        this.resolution = resolution;
        this.durationMin = durationMin;
        this.durationSec = durationSec;
        this.coments = coments;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public Youtube(Youtube video) {
        this.name = video.getName();
        this.content = video.getContent();
        this.uploadDate = video.getUploadDate();
        this.resolution = video.getResolution();
        this.durationMin = video.getDurationMin();
        this.durationSec = video.getDurationSec();
        this.coments = video.getComents();
        this.likes = video.getLikes();
        this.dislikes = video.getDislikes();
    }

    public String getName() {
        return this.name;
    }

    public String getContent() {
        return this.content;
    }

    public LocalDate getUploadDate() {
        return uploadDate;
    }

    public int getResolution() {
        return this.resolution;
    }

    public int getDurationMin() {
        return this.durationMin;
    }

    public int getDurationSec() {
        return this.durationSec;
    }

    public ArrayList<String> getComents() {
        return this.coments;
    }

    public int getLikes() {
        return this.likes;
    }

    public int getDislikes() {
        return this.dislikes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUploadDate(LocalDate date) {
        this.uploadDate = date;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public void setDurationMin(int durationMin) {
        this.durationMin = durationMin;
    }

    public void setDurationSec(int durationSec) {
        this.durationSec = durationSec;
    }

    public void setComents(ArrayList<String> coments) {
        this.coments = coments;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    /**
     * Método que representa o objeto em formato de texto
     * @return
     */
    public String toString() {
        return ("Nome: " + getName() + "\n" +
                "Conteúdo: " + getContent() + "\n" +
                "Data de Upload: " + getUploadDate() + "\n" +
                "Resolução: " + getResolution() + "\n" +
                "Tempo em minutos: " + getDurationMin() + "\n" +
                "Tempo em segundos: " + getDurationSec() + "\n" +
                "Comentários: " + getComents() + "\n" +
                "Likes: " + getLikes() + "\n" +
                "Dislikes: " + getDislikes() + "\n");
    }

    public boolean equals(Object obj) {
        if(obj == this)
            return true;

        if((obj == null) || (this.getClass() != obj.getClass()))
            return false;

        Youtube video = (Youtube) obj;
        return (this.name == video.getName() &&
                this.content.equals(video.getContent()) &&
                this.uploadDate.equals(video.getUploadDate()) &&
                this.resolution == video.getResolution() &&
                this.durationMin == video.getDurationMin() &&
                this.durationSec == video.getDurationSec() &&
                this.coments == video.getComents() &&
                this.likes == video.getLikes() &&
                this.dislikes == video.getDislikes());
    }

    public Youtube clone() {
        return new Youtube(this);
    }

    // 3. b)
    /**
     * Método que adiciona um comentário ao vídeo.
     * @param comentario comentario que vai ser adicionado.
     */
    public void insereComentario(String comentario) {
        this.coments.add(comentario);
    }

    // 3. c)
    public long qtsDiasDepois() {
        return (long) (LocalDate.now().getDayOfYear() - this.uploadDate.getDayOfYear());
    }

    // 3. d)
    public void thumbsUp() {
        this.likes++;
    }

    // 3. e)
    public String processa() {
        return this.content;
    }
}

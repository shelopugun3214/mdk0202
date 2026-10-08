import java.util.ArrayList;
import java.util.Arrays;

public class Practicum3 {
    public static void main(String[] args) {
        Post post = new Post();
        post.setTitle("Почему второй язык программирования выучить проще, чем первый?");
        post.setContent("Если вы научились водить автомобиль на механике, " +
                "вы можете сесть плюс-минус за любой автомобиль и поехать. " +
                "Вам необязательно ездить именно за тем рулём, " +
                "за которым вы учились в автошколе. " +
                "Может быть, первое время вам будет непривычно в новой машине," +
                " но вы быстро освоитесь.");
        post.setTags(new String[]{"Образование", "Карьера в IT"});

        PostComment comment1 = new PostComment();
        comment1.setText("Отличная статья!");
        comment1.setWhoLiked(new String[] { "Lera93", "934Vasya1" });

        PostComment comment2 = new PostComment();
        comment2.setText("Тема не раскрыта :(");
        comment2.setWhoLiked(new String[] { "Petya070707", "Masha90" });

        PostComment comment3 = new PostComment();
        comment3.setText("❤❤❤");

        ArrayList<PostComment> comments = new ArrayList<>();
        comments.add(comment1);
        comments.add(comment2);
        comments.add(comment3);
        post.setComments(comments);

        System.out.println(post);
    }
}

class Post {
    private String title;
    private String content;
    private String[] tags;
    private ArrayList<PostComment> comments;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void setComments(ArrayList<PostComment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        int contentLength = (content == null) ? 0 : content.length();

        String tagsStr = (tags == null) ? "null" : Arrays.toString(tags);

        String commentsStr;
        if (comments == null || comments.isEmpty()) {
            commentsStr = "[]";
        } else {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < comments.size(); i++) {
                sb.append(comments.get(i).toString());
                if (i < comments.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            commentsStr = sb.toString();
        }

        return "Post{title='" + title + "', content.length='" + contentLength + "', tags=" + tagsStr + ", comments=" + commentsStr + "}";
    }
}

class PostComment {
    private String text;
    private String[] whoLiked;

    public void setText(String text) {
        this.text = text;
    }

    public void setWhoLiked(String[] whoLiked) {
        this.whoLiked = whoLiked;
    }

    @Override
    public String toString() {
        String whoLikedStr = (whoLiked == null) ? "null" : Arrays.toString(whoLiked);
        return "PostComment{text='" + text + "', whoLiked=" + whoLikedStr + "}";
    }
}

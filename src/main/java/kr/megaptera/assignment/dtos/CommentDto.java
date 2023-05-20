package kr.megaptera.assignment.dtos;

import kr.megaptera.assignment.models.Comment;

public class CommentDto {

    private String id;

    private String author;

    private String content;

    public CommentDto() {
    }

    public CommentDto(Comment comment) {
        this.id = comment.Id().toString();
        this.author = comment.Author().toString();
        this.content = comment.Content().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

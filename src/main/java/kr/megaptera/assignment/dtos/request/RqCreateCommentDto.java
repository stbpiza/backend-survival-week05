package kr.megaptera.assignment.dtos.request;

public class RqCreateCommentDto {

    private String author;

    private String content;

    public RqCreateCommentDto() {
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

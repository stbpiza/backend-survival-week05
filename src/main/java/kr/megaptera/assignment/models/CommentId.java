package kr.megaptera.assignment.models;

import java.util.Objects;

public class CommentId {

    private String id;

    public CommentId(String id) {
        this.id = id;
    }

    public static CommentId of(int id) {
        return new CommentId(Integer.toString(id));
    }

    @Override
    public String toString() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentId commentId = (CommentId) o;
        return Objects.equals(id, commentId.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

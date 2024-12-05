package ph.salmon.test.models;

public record Post(Integer id, Integer userId, String title, String body) {

    public static class Builder {
        private int id;
        private int userId;
        private String title;
        private String body;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder userId(int userId) {
            this.userId = userId;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        // Метод для создания экземпляра Post
        public Post build() {
            return new Post(id, userId, title, body);
        }
    }
}
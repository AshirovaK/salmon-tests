package ph.salmon.test.webservices;

import ph.salmon.test.models.Post;

public class PostService implements CrudInterface<Post> {

    String BASE_URL = "https://jsonplaceholder.typicode.com";

    //RestAssured.baseURI = BASE_URL;
    //RestAssured.basePath = "/posts";
//    RestAssured.filters(allureFilter);


    @Override
    public Post create(Post item) {
        return null;
    }

    @Override
    public Post read(int id) {
        return null;
    }

    @Override
    public Post update(int id, Post item) {
        return null;
    }

    @Override
    public String delete(int id) {
        return "";
    }
}

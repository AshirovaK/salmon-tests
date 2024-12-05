package ph.salmon.test

data class Post(
    val id: Int,
    val userId: Int,
    val title: String,
    val body: String
)

class PostBuilder {
    private var id: Int = 0
    private var userId: Int = 0
    private var title: String = ""
    private var body: String = ""

    fun setId(id: Int) = apply { this.id = id }
    fun setUserId(userId: Int) = apply { this.userId = userId }
    fun setTitle(title: String) = apply { this.title = title }
    fun setBody(body: String) = apply { this.body = body }

    fun build(): Post {
        return Post(id, userId, title, body)
    }
}
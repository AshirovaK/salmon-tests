package ph.salmon.test.webservices;

public interface CrudInterface<T> {
    T create(T item);               // Создать элемент
    T read(int id);                 // Прочитать элемент по ID
    T update(int id, T item);       // Обновить элемент по ID
    String delete(int id);          // Удалить элемент по ID
}

package bo;

import java.util.List;

/**
 * An interface for operations on elements of type E.
 *
 * @param <E> the type of elements in this interface
 */
public interface IMethod<E> {
    /**
     * Adds an element to the collection.
     *
     * @return true if the element was successfully added, false otherwise
     */
    boolean add();

    /**
     * Updates an element in the collection based on its roll number.
     *
     * @param rollNumber the roll number of the element to update
     * @return true if the element was successfully updated, false otherwise
     */
    boolean update(String rollNumber);

    /**
     * Removes an element from the collection based on its roll number.
     *
     * @param rollNumber the roll number of the element to remove
     * @return true if the element was successfully removed, false otherwise
     */
    boolean remove(String rollNumber);

    /**
     * Searches for elements in the collection that contain the given text.
     *
     * @param text the text to search for
     * @return a list of elements that contain the given text
     */
    List<E> search(String text);

    /**
     * Sorts the elements in the collection.
     */
    void sort();

    /**
     * Displays the elements in the collection.
     */
    void display();
}

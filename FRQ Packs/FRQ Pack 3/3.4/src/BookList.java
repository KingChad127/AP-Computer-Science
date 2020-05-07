import java.util.*;

public class BookList
{
    private final ArrayList<Book> myList;
    // collection of books in sorted order as defined
    // by compareTo;  myList.length() > 0

    private final int myCount;
    // number of books in myList

    public BookList()
    {
        myList = new ArrayList();
        myList.add(new Book("Madeline", "Bemelmans", 3, 8));
        myList.add(new Book("The Lorax", "Seuss", 3, 10));
        myList.add(new Book("Harry Potter and the Sorcerer's Stone", "Rowling", 9, 99));
        myList.add(new Book("Holes", "Sacher", 12, 18));
        myList.add(new Book("I Know Why the Caged Bird Sings", "Angelou", 16, 99));

        myCount = myList.size();
    }


    // precondition:  this BookList is in sorted order by age
    //                range as defined by compareTo;
    //                bk is not already in this BookList
    // postcondition: bk has been inserted into this BookList,
    //                maintaining its order by age range
    public void insertOne(Book bk)
    {
        Book left;
        Book right;
        if (bk.compareTo(myList.get(myList.size() - 1)) == 1)
        {
            myList.add(bk);
        }
        for (int i = 0; i < myList.size() - 1; i++)
        {
            left = myList.get(i);
            right = myList.get(i + 1);
            if (bk.compareTo(left) == 1 && bk.compareTo(right) == -1)
            {
                myList.add(i + 1, bk);
                break;
            }
            if (bk.compareTo(left) == 0)
            {
                myList.add(i + 1, bk);
                break;
            }
        }
    }

    // precondition:  this BookList is in sorted order by range
    //                as defined by compareTo; second contains
    //                second.length() books in arbitrary order;
    //                none of the books in second are in this
    //                BookList
    // postcondition: all the books from second have been inserted
    //                into this BookList, maintaining its order by
    //                age range
    public void insertMany(ArrayList<Book> second)
    {
        for (int i = 0; i < second.size(); i++)
        {
            insertOne(second.get(i));
        }
    }

    public String toString()
    {
        String str = "";
        for (int i = 0; i < myList.size(); i++)
        {
            str += myList.get(i) + "\n";
        }
        return str;
    }
}
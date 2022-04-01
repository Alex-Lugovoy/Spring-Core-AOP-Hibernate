package AOP;

import org.springframework.stereotype.Component;

@Component
public class Library {
    private String name;

    public void getBook()
    {
        System.out.println("Мы берём книгу");
    }

    public void getMagazine(){
        System.out.println("Мы берём журнал");
    }

    public void addBook(){
        System.out.println("Мы добавили книгу");
    }

    public String getNames() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;

        Library library = (Library) o;

        return name != null ? name.equals(library.name) : library.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}

package Education;

public class BookFinalize {

    boolean chekedOut = false;
    BookFinalize(boolean checkOut){
        chekedOut = checkOut;
    }

    void checkIn(){
        chekedOut = false;
    }

    public void finalize(){
        if (chekedOut){
            System.out.println("Ошибка: checkedOut");
        }
    }

    public static void main(String[] args) {
        BookFinalize novel = new BookFinalize(true);

        //правильная очистка
        novel.checkIn();

        //Теряем ссылку, забыли про очистку
        new BookFinalize(true);

        System.gc();



    }


}

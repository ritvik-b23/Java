class NameInvalidException extends Exception {
    public NameInvalidException(String error) {
        super(error);
    }
}
class AgeInvalidException extends Exception {
    public AgeInvalidException(int error) {
        super(String.valueOf(error));
    }
}
class YearInvalidException extends Exception {
    public YearInvalidException(int error) {
        super(String.valueOf(error));
    }
}
class IdInvalidException extends Exception {
    public IdInvalidException(String error) {
        super(error);
    }
}

class Checker {

    public static boolean nameCheck(String name) throws NameInvalidException {
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isAlphabetic(name.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean ageCheck(int age) throws AgeInvalidException {
        if(age>=35) {
            return false;
        }
        else return true;
    }

    public static boolean yearCheck(int year) throws YearInvalidException {
        if(year<1 || year>4) {
            return false;
        }
        else return true;
    }

    public static boolean idCheck(String id) throws IdInvalidException {
        if (id.length() == 6) {
            if (Character.isAlphabetic(id.charAt(0)) && Character.isAlphabetic(id.charAt(5))) {
                for (int i = 1; i < 5; i++) {
                    if (Character.isDigit(id.charAt(i))) {
                        return true;
                    } else
                        return false;
                }
            } else
                return false;
        } else
            return false;
        return false;
    }
}

class Student {
    private String name;
    private int year;
    private String idno;
    private int age;

    public Student(String name, int age, int year, String idno) throws NameInvalidException, AgeInvalidException, YearInvalidException, IdInvalidException {
        this.name = name;
        this.year = year;
        this.age = age;
        this.idno = idno;
        if( !Checker.nameCheck(name) ) { throw new NameInvalidException(name); }
        if( !Checker.ageCheck(age) ) { throw new AgeInvalidException(age); }
        if( !Checker.yearCheck(year) ) { throw new YearInvalidException(year); }
        if( !Checker.idCheck(idno) ) { throw new IdInvalidException(idno); }
    }
}

public class q2 {
    public static void main(String[] args) {
        String name = "Name";
        int year = 3;
        String idno = "f0031U";
        int age = 19;

        try {
            Student st = new Student(name, age, year, idno);
        } catch (NameInvalidException | AgeInvalidException | YearInvalidException | IdInvalidException e) {
            e.printStackTrace();
        }
    }
}

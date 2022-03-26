package pl.coderslab.entity;

public class MainDAO {

    public static void main(String[] args) {

       UserDAO userDAO = new UserDAO();

        User[] tab = userDAO.findAll();

        for (User u : tab){
            System.out.println(u.getId());
            System.out.println(u.getPassword());
            System.out.println(u.getUserName());
            System.out.println(u.getEmail());
        }

    }
}

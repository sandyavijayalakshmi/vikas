import javax.persistence.*;
  
import com.java.mapping.*;
import com.java.mapping.Library.*;
import com.java.mapping.Student;

  
public class OneToOneExample {  
  
    public static void main(String[] args) {  
          
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "pu" );  
           EntityManager em = emf.createEntityManager( );  
           em.getTransaction( ).begin( );  
          
           Student st1=new Student();  
           st1.setS_id(1);  
           st1.setS_name("Vipul");  
             
           Student st2=new Student();  
           st2.setS_id(2);  
           st2.setS_name("Vimal");  
             
             
           em.persist(st1);  
           em.persist(st2);  
             
           Library lib1=new Library();  
           lib1.setB_id(101);  
           lib1.setB_name("Data Structure");  
           lib1.setStud(st1);  
             
           Library lib2=new Library();  
           lib2.setB_id(102);  
           lib2.setB_name("DBMS");  
           lib2.setStud(st2);  
             
           em.persist(lib1);  
           em.persist(lib2);  
             
           em.getTransaction().commit();  
             
           em.close();  
           emf.close();  
  }  
      
      
}  

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernetutil {
    private static Configuration cfg=null;
    private static SessionFactory factory;
    static {
        cfg=new Configuration();
        cfg.configure();
        factory=cfg.buildSessionFactory();
    }
    public static Session getSession(){
        return factory.openSession();
    }
}

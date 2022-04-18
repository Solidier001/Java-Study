import org.hibernate.Session;
import org.hibernate.Transaction;
import dao.Record;
import org.junit.Test;

public class test {
    public static void main(String[] args) {
        Record record=new Record();
        record.setContext("Context");
        record.setReceiver("Receiver");
        record.setSender("Sender");
        Session session= hibernetutil.getSession();
        Transaction tx=session.beginTransaction();
        session.save(record);
        tx.commit();
        session.close();
    }
    @Test
    public void test1(){
        Session session= hibernetutil.getSession();
        Transaction tx=session.beginTransaction();
        Record record=session.get(Record.class,1);
        tx.commit();
        session.close();
        System.out.print(record.getId());
        System.out.print(" "+record.getSender());
        System.out.print(" "+record.getReceiver());
        System.out.println(" "+record.getReceiver());
    }
    @Test
    public void delete(){
        Session session= hibernetutil.getSession();
        Transaction tx=session.beginTransaction();
        Record record=session.get(Record.class,1);
        session.delete(record);
        tx.commit();
        session.close();
    }
}

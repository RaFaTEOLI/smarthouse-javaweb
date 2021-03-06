package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DaoMorador extends DaoGenerico {
    public DaoMorador() {
        
    }
    public Long validarMorador(Object moradorId, Object casaId) throws HibernateException {
        Session session = hibernateConfiguracao.openSession();
        Transaction transaction = session.beginTransaction();
        
        org.hibernate.Query query = session.createQuery("SELECT COUNT(*) FROM Morador WHERE pessoaId = '" + moradorId + "' AND casaId = '" + casaId + "'");
        System.out.println("LOG STATUS | Selecionando se a Pessoa: " + moradorId + " já é morador da casa: " + casaId + "... ");
        System.out.println("LOG QUERY | " + query);
        System.out.println("LOG RETURN | " + (Long) query.uniqueResult());
        return (Long) query.uniqueResult();
    }
}

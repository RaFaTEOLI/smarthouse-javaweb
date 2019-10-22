package model;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@ManagedBean (name="casa")
@SessionScoped
@Entity
public class Casa implements Serializable {
    @Id
    @Column(unique=true)
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Integer casaid;
    
    @ManyToOne
    @JoinColumn(name="proprietarioid")
    private Pessoa proprietarioid;
    
    private String nome;
    private String endereco;
    private String cidade;
    private String cep;
    
    public Casa() {
        
    }

    /**
     * @return the casaId
     */
    public Integer getId() {
        return casaid;
    }

    /**
     * @param casaId the casaId to set
     */
    public void setId(Integer id) {
        this.casaid = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }
    
    /**
     * @return the pessoa
     */
    public Pessoa getPessoa() {
        return proprietarioid;
    }

    /**
     * @param pessoa the pessoa to set
     */
    public void setPessoa(Pessoa pessoa) {
        this.proprietarioid = pessoa;
    }
    
    @Override
    public String toString() {
        return this.casaid + " - " + this.getNome();
    }
    
    @Override
    public boolean equals(Object obj) {
        boolean result = false;
            if (this.getId().equals(((Casa)obj).getId())) {
                result = true;
            }
        return result;
    }
    
}

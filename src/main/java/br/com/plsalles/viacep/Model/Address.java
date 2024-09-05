package br.com.plsalles.viacep.Model;



import java.util.Date;

@Data
@Entity
public class Address {

    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private String city;
    private String state;
    private String cep;
    private String country;
    private Date dataCriacao;


}
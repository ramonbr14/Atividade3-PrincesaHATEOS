package br.edu.aranoua.ramonsantos.princesas.modelo;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Relation(collectionRelation = "princesas")
@JsonRootName(value = "princesa")
@JsonInclude(Include.NON_NULL)
public class PrincesasModel extends RepresentationModel<PrincesasModel> {
	private Long id;
	private String nome;
	private String reino;
	private int idade;
	public void setId(Long id2) {
		// TODO Auto-generated method stub
		
	}
	public void setNome(String nome2) {
		// TODO Auto-generated method stub
		
	}
	public void setReino(String reino2) {
		// TODO Auto-generated method stub
		
	}
	public void setIdade(int idade2) {
		// TODO Auto-generated method stub
		
	}
}

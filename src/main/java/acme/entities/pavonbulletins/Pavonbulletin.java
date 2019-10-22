
package acme.entities.pavonbulletins;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Pavonbulletin extends DomainEntity {

	//Serialisation identifier -------------------------------------------------------------------------------

	private static final long	serialVersionUID	= 1L;

	//Attributes ---------------------------------------------------------------------------------------------

	@NotBlank
	private String				author;

	@NotBlank
	private String				text;

	@Temporal(TemporalType.DATE)
	private Date				date;

}

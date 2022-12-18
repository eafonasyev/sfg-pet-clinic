package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 8/5/18.
 */
//by Eafonasyev
public interface  PetTypeRepository extends CrudRepository<PetType, Long> {
}

package info.beambitious.sandbox.booth2jpademo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "postalcode", path = "postalcodes")
public interface PostalCodeInfoRepository extends PagingAndSortingRepository<PostalCodeInfo, Long> {

    List<PostalCodeInfo> findByCode7(@Param("code") String code);

    @Query("SELECT p FROM PostalCodeInfo p "
            + "WHERE address1 LIKE CONCAT('%',:name,'%')"
            + " OR address2 LIKE CONCAT('%',:name,'%')"
            + " OR address3 LIKE CONCAT('%',:name,'%')"
            + " ORDER BY p.code7")
    List<PostalCodeInfo> anyFieldLike(@Param("name") String name);
}

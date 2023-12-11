package org.mourya.sfgrestdocsexample.web.mappers;

import org.mapstruct.Mapper;
import org.mourya.sfgrestdocsexample.domain.Beer;
import org.mourya.sfgrestdocsexample.web.model.BeerDto;

/**
 * Created by jt on 2019-05-25.
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
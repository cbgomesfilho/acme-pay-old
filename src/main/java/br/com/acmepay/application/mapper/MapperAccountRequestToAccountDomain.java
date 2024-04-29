package br.com.acmepay.application.mapper;

import br.com.acmepay.application.domain.models.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapperAccountRequestToAccountDomain {
    MapperAccountRequestToAccountDomain MAPPER = Mappers.getMapper(MapperAccountRequestToAccountDomain.class);
    AccountDomain toAccountDomain(Account account);
}

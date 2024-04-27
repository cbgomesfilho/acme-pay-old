package br.com.acmepay.mapper;

import br.com.acmepay.domain.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapperAccountRequestToAccountDomain {
    MapperAccountRequestToAccountDomain MAPPER = Mappers.getMapper(MapperAccountRequestToAccountDomain.class);
    AccountDomain toAccountDomain(Account account);
}

package example.profiles.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author xiaokui
 * @Description:
 * @date 2018-04-24 23:01
 */
@Service
@Profile("prod")
public class ProdAuthorityServiceImpl implements AuthorityService{

    @Override
    public boolean hasRole(String role) {
        return role == "admin";
    }
}

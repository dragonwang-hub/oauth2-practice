package com.practice.oauth2;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.*;

public class GithubOAuthUser implements OAuth2User {

    private final List<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList("ROLE_USER");
    private Map<String, Object> attributes;

    private String id;
    private String name;
    private String email;
    private String login;


    @Override
    public Map<String, Object> getAttributes() {
        if(this.attributes == null) {
            this.attributes = new HashMap<>();
            this.attributes.put("id", this.id);
            this.attributes.put("name", this.name);
            this.attributes.put("email", this.email);
            this.attributes.put("login", this.login);
        }
        return this.attributes;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}

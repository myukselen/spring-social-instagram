package org.springframework.social.instagram.security;

import org.springframework.social.instagram.api.Instagram;
import org.springframework.social.instagram.connect.InstagramConnectionFactory;
import org.springframework.social.security.provider.OAuth2AuthenticationService;

public class InstagramAuthenticationService extends OAuth2AuthenticationService<Instagram> {

	public InstagramAuthenticationService(final String apiKey, final String appSecret) {
		super(new InstagramConnectionFactory(apiKey, appSecret));
	}

}

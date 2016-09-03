package org.springframework.social.instagram.api;

import org.springframework.social.ApiBinding;

/**
 * Interface specifying a basic set of operations for interacting with Instagram. Implemented by InstagramTemplate. Not often used directly, but a useful option
 * to enhance testability, as it can easily be mocked or stubbed.
 */
public interface Instagram extends ApiBinding {

	/**
	 * Returns the portion of the Instagram API that handles tag operations
	 * @return tag operations
	 */
	TagOperations tagOperations();

	/**
	 * Returns the portion of the Instagram API that handles location operations
	 * @return location operations
	 */
	LocationOperations locationOperations();

	/**
	 * Returns the portion of the Instagram API that handles media operations
	 * @return media operations
	 */
	MediaOperations mediaOperations();

	/**
	 * Returns the portion of the Instagram API that handles user operations
	 * @return user operations
	 */
	UserOperations userOperations();

}

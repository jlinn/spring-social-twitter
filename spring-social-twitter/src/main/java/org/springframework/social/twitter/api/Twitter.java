/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.twitter.api;

import org.springframework.social.ApiBinding;
import org.springframework.web.client.RestOperations;


/**
 * Interface specifying a basic set of operations for interacting with Twitter.
 * Implemented by TwitterTemplate.
 *
 * @author Craig Walls
 */
public interface Twitter extends ApiBinding {
	
	/**
	 * Returns the portion of the Twitter API containing the block operations.
	 */
	BlockOperations blockOperations();
	
	/**
	 * Returns the portion of the Twitter API containing the direct message operations.
	 */
	DirectMessageOperations directMessageOperations();

	/**
	 * Returns the portion of the Twitter API containing the friends and followers operations.
	 */
	FriendOperations friendOperations();

	/**
	 * Returns the portion of the Twitter API containing the geo location operations.
	 */
	GeoOperations geoOperations();

	/**
	 * Returns the portion of the Twitter API containing the user list operations.
	 */
	ListOperations listOperations();

	/**
	 * Returns the portion of the Twitter API containing the search operations.
	 */
	SearchOperations searchOperations();

	/**
	 * Returns the portion of the Twitter API containing the streaming operations.
	 */
	StreamingOperations streamingOperations();
	
	/**
	 * Returns the portion of the Twitter API containing the tweet and timeline operations.
	 */
	TimelineOperations timelineOperations();

	/**
	 * Returns the portion of the Twitter API containing the user operations.
	 */
	UserOperations userOperations();

	/**
	 * Returns the underlying {@link RestOperations} object allowing for consumption of Twitter endpoints that may not be otherwise covered by the API binding.
	 * The RestOperations object returned is configured to include an OAuth "Authorization" header on all requests.
	 */
	RestOperations restOperations();

}

/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
*/
package org.openapitools.server.models


/**
 * A category for a pet
 * @param id 
 * @param name 
 */
data class Category(
    
    @field:com.fasterxml.jackson.annotation.JsonProperty("id")
    val id: kotlin.Long? = null,
    
    @field:com.fasterxml.jackson.annotation.JsonProperty("name")
    val name: kotlin.String? = null
)



# InlineResponse200

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**submitTimeUtc** | **String** | Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC.  |  [optional]
**totalCount** | **Integer** | Specifies the total number of items found based on the request |  [optional]
**offset** | **Integer** | Specifies the record offset from the records are returned part of the response |  [optional]
**limit** | **Integer** | Specifies the maximum number of records requested part of the response |  [optional]
**sort** | **String** | Specifies a comma separated list of field names based on which the result is sorted. |  [optional]
**keys** | [**List&lt;InlineResponse200Keys&gt;**](InlineResponse200Keys.md) |  |  [optional]




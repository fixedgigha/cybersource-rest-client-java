/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Api;

import Invokers.ApiException;
import Model.Body;
import Model.TssV2GetEmvTags200Response;
import Model.TssV2PostEmvTags200Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EMVTagDetailsApi
 */
@Ignore
public class EMVTagDetailsApiTest {

    private final EMVTagDetailsApi api = new EMVTagDetailsApi();

    
    /**
     * Retrieve the EMV Dictionary
     *
     * Returns the entire EMV tag dictionary
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmvTagsTest() throws ApiException {
        TssV2GetEmvTags200Response response = api.getEmvTags();

        // TODO: test validations
    }
    
    /**
     * Parse an EMV String
     *
     * Pass an EMV Tag-Length-Value (TLV) string for parsing.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void parseEmvTagsTest() throws ApiException {
        Body body = null;
        TssV2PostEmvTags200Response response = api.parseEmvTags(body);

        // TODO: test validations
    }
    
}

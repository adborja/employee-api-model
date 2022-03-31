/*
 * Employee Management
 * This is a camel-k demo for creating and updating an employee
 *
 * OpenAPI spec version: 1.0.0
 * Contact: david.borja@modusbox.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.modusbox.employee.api;

import com.modusbox.employee.model.Employee;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for EmployeeApi
 */
@Ignore
public class EmployeeApiTest {

    private final EmployeeApi api = new EmployeeApi();

    /**
     * Add a new employee
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createEmployeeTest() throws Exception {
        Employee body = null;
        Employee response = api.createEmployee(body);

        // TODO: test validations
    }
    /**
     * Deletes an employee
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteEmployeeTest() throws Exception {
        String id = null;
        api.deleteEmployee(id);

        // TODO: test validations
    }
    /**
     * Update an existing employee
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateEmployeeTest() throws Exception {
        Employee body = null;
        String id = null;
        Employee response = api.updateEmployee(body, id);

        // TODO: test validations
    }
}
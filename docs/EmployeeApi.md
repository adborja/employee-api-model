# EmployeeApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEmployee**](EmployeeApi.md#createEmployee) | **POST** /employees | Add a new employee
[**deleteEmployee**](EmployeeApi.md#deleteEmployee) | **DELETE** /employees/{id} | Deletes an employee
[**updateEmployee**](EmployeeApi.md#updateEmployee) | **PUT** /employees/{id} | Update an existing employee

<a name="createEmployee"></a>
# **createEmployee**
> Employee createEmployee(body)

Add a new employee

### Example
```java
// Import classes:
//import com.modusbox.employee.ApiException;
//import com.modusbox.employee.api.EmployeeApi;


EmployeeApi apiInstance = new EmployeeApi();
Employee body = new Employee(); // Employee | Employee object that needs to be added
try {
    Employee result = apiInstance.createEmployee(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeApi#createEmployee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Employee**](Employee.md)| Employee object that needs to be added |

### Return type

[**Employee**](Employee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEmployee"></a>
# **deleteEmployee**
> deleteEmployee(id)

Deletes an employee

### Example
```java
// Import classes:
//import com.modusbox.employee.ApiException;
//import com.modusbox.employee.api.EmployeeApi;


EmployeeApi apiInstance = new EmployeeApi();
String id = "id_example"; // String | 
try {
    apiInstance.deleteEmployee(id);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeApi#deleteEmployee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateEmployee"></a>
# **updateEmployee**
> Employee updateEmployee(body, id)

Update an existing employee

### Example
```java
// Import classes:
//import com.modusbox.employee.ApiException;
//import com.modusbox.employee.api.EmployeeApi;


EmployeeApi apiInstance = new EmployeeApi();
Employee body = new Employee(); // Employee | Employee object that needs to be updated
String id = "id_example"; // String | Employee id
try {
    Employee result = apiInstance.updateEmployee(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeApi#updateEmployee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Employee**](Employee.md)| Employee object that needs to be updated |
 **id** | **String**| Employee id |

### Return type

[**Employee**](Employee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


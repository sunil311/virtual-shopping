package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Product;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-10T09:53:45.928Z")

@Api(value = "createProduct", description = "the createProduct API")
public interface CreateProductApi {

    @ApiOperation(value = "Create a product with vendor id and category id", notes = "", response = Integer.class, tags={ "Product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Product Created", response = Integer.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Integer.class) })
    @RequestMapping(value = "/createProduct",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Integer> placeOrder(

@ApiParam(value = "Create aproduct"  ) @RequestBody Product body

);

}
/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.14).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-07-21T12:37:02.908Z")

@Api(value = "conta", description = "the conta API")
@RequestMapping(value = "/bytebank-api/v1")
public interface ContaApi {

    @ApiOperation(value = "Consulta Saldo", nickname = "consultaSaldo", notes = "Consulta o saldo da conta do cliente", response = Double.class, authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "Conta", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Consulta a saldo efetuada com sucesso", response = Double.class),
        @ApiResponse(code = 400, message = "Requisição inválida"),
        @ApiResponse(code = 401, message = "Requisição não autorizada"),
        @ApiResponse(code = 500, message = "Erro no servidor") })
    @RequestMapping(value = "/conta/{agencia}/{numero}/{digito}/saldo",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Double> consultaSaldo(@ApiParam(value = "",required=true) @PathVariable("agencia") Integer agencia,@ApiParam(value = "",required=true) @PathVariable("numero") Long numero,@ApiParam(value = "",required=true) @PathVariable("digito") Integer digito,@ApiParam(value = "" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization);

}
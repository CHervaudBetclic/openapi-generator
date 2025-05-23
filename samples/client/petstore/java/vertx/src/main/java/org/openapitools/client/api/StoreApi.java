package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.Order;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface StoreApi {

    void deleteOrder(@javax.annotation.Nonnull String orderId, Handler<AsyncResult<Void>> handler);

    void deleteOrder(@javax.annotation.Nonnull String orderId, ApiClient.AuthInfo authInfo, Handler<AsyncResult<Void>> handler);

    void getInventory(Handler<AsyncResult<Map<String, Integer>>> handler);

    void getInventory(ApiClient.AuthInfo authInfo, Handler<AsyncResult<Map<String, Integer>>> handler);

    void getOrderById(@javax.annotation.Nonnull Long orderId, Handler<AsyncResult<Order>> handler);

    void getOrderById(@javax.annotation.Nonnull Long orderId, ApiClient.AuthInfo authInfo, Handler<AsyncResult<Order>> handler);

    void placeOrder(@javax.annotation.Nonnull Order order, Handler<AsyncResult<Order>> handler);

    void placeOrder(@javax.annotation.Nonnull Order order, ApiClient.AuthInfo authInfo, Handler<AsyncResult<Order>> handler);

}

package com.codewithmosh.store.services;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

/**
 * @author ileanaoneata on 08.07.2025
 */

@AllArgsConstructor
@Getter
public class WebhookRequest {

    private Map<String, String> headers;
    private String payload;
}

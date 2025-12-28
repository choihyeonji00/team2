package com.team2.householdledger.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommonDTO<T> {
    private int status;
    private String message;
    private T data;

    public static <T> CommonDTO<T> success(T data) {
        return CommonDTO.<T>builder()
                .status(200)
                .message("성공")
                .data(data)
                .build();
    }

    public static <T> CommonDTO<T> error(int status, String message) {
        return CommonDTO.<T>builder()
                .status(status)
                .message(message)
                .build();
    }
}

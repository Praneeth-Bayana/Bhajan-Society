package com.bs.bs.Model.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Events {
    @Id
    private Long id;
    private String eventName;
    private String paymentMode;

    public void setUserName(User user) {
    }
}

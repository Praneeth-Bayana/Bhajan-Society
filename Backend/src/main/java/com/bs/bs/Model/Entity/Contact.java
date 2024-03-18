package com.bs.bs.Model.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    @Id
    private String contactId;
    private String contactName;
    private String contactEmail;
    private String contactSubject;
    private String contactPhone;
    private String contactMessage;
}

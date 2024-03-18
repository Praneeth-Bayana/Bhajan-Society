package com.bs.bs.Model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactDTO {
    private String contactId;
    private String contactName;
    private String contactEmail;
    private String contactSubject;
    private String contactPhone;
    private String contactMessage;
}

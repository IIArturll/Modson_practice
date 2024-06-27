package com.example.orderservice.enities;

import com.example.orderservice.core.enums.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user_status", schema = "modsen")
@NoArgsConstructor
@Getter
public class StatusEntity {
    @Id
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;
    @Enumerated(EnumType.STRING)
    private Status status;

    public StatusEntity(Status status) {
        this.status = status;
        this.id = (short) (status.ordinal() + 1);
    }

    public void setStatus(Status status) {
        this.status = status;
        this.id = (short) (status.ordinal() + 1);
    }
}

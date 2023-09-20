package com.example.personalconcierge.model;


import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "tasks", schema = "public")
@NoArgsConstructor
public class Task {

    @Id
private int id;
private String name;
private boolean isCompleted, isUrgent, isImportant, isToDoLater;
@Enumerated(EnumType.STRING)
private Category category;
}

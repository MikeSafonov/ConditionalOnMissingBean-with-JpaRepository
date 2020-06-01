package com.example.demo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Max Kazantsev
 */
@Getter
@Setter
@NoArgsConstructor
@Table(name = "files")
@Entity
public class FileEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date_create")
    private LocalDateTime dateCreate;

    @Column
    private String name;

    @Column(name = "meta_info_hash")
    private String metaInfoHash;
}

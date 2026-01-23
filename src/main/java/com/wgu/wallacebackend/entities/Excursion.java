package com.wgu.wallacebackend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "excursions")
@Getter
@Setter
@NoArgsConstructor
public class Excursion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "excursion_id", nullable = false)
    private Long excursion_id;

    @Column(name = "excursion_title", nullable = false)
    private String excursion_title;

    @Column(name = "excursion_price", nullable = false)
    private BigDecimal excursion_price;

    @Column(name = "image_url")
    private String image_URL;

    @Column(name = "create_date", updatable = false)
    @CreationTimestamp
    private Date create_date;

    @Column(name = "last_update")
    @UpdateTimestamp
    private Date last_update;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vacation_id", nullable = false)
    @ToString.Exclude
    private Vacation vacation;

    @ManyToMany(mappedBy = "excursions")
    @ToString.Exclude
    private Set<CartItem> cartItems = new HashSet<>();
}

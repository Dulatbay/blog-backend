package techpark.net.blogbackend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "blog",schema="schema_tech-park-net")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "author_id", nullable = false)
    private long authorId;

    @Column(name = "description")
    private String description;

    @Column(name = "has_collab")
    private boolean isPremium;

    @Column(name = "has_music")
    private boolean hasMusic;

    @Column(name = "created_at", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdAt;

    @Column(name = "updatedAt")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime updatedAt;
}

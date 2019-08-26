package org.launchcode.springWebApp.springframework.spring5webapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Song {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String title;
        private String type;
        private String lyrics;

        @ManyToMany
        @JoinTable(name = "artist_song", joinColumns = @JoinColumn(name = "song_id"),
                inverseJoinColumns = @JoinColumn(name = "artist_id"))
        private Set<Artist> artists = new HashSet<>();

        public Song() {
        }

        public Song(String title, String type, String lyrics) {
            this.title = title;
            this.type = type;
            this.lyrics = lyrics;
        }

        public Song(String title, String type, String lyrics, Set<Artist> artists) {
            this.title = title;
            this.type = type;
            this.lyrics = lyrics;
            this.artists = artists;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getLyrics() {
            return lyrics;
        }

        public void setLyrics(String lyrics) {
            this.lyrics = lyrics;
        }

        public Set<Artist> getArtists() {
            return artists;
        }

        public void setArtists(Set<Artist> artists) {
            this.artists = artists;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Song song = (Song) o;

            return id != null ? id.equals(song.id) : song.id == null;
        }

        @Override
        public int hashCode() {
            return id != null ? id.hashCode() : 0;
        }

        @Override
        public String toString() {
            return "Song{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    ", type='" + type + '\'' +
                    ", lyrics='" + lyrics + '\'' +
                    ", artists=" + artists +
                    '}';
        }
    }



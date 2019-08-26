package org.launchcode.springWebApp.springframework.spring5webapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Artist {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String firstName;
        private String lastName;

        @ManyToMany(mappedBy = "artist")
        private Set<Song> songs  = new HashSet<>();

        public Artist() {
        }

        public Artist(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Artist(String firstName, String lastName, Set<Song> books) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.songs = books;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Set<Song> getSongs() {
            return songs;
        }

        public void setSongs(Set<Song> books) {
            this.songs = books;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Artist artist = (Artist) o;

            return id != null ? id.equals(artist.id) : artist.id == null;
        }

        @Override
        public int hashCode() {
            return id != null ? id.hashCode() : 0;
        }

        @Override
        public String toString() {
            return "Artist{" +
                    "id=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", songs=" + songs +
                    '}';
        }
    }



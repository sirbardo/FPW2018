/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  bardoz
 * Created: 14-mag-2018
 */


/*
    private int id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String urlProfImg;
*/

create table users(
    id_user serial primary key,
    name varchar(100),
    surname varchar(100),
    email varchar(150),
    password varchar(50),
    urlProfImg varchar(300)
);

/*
    private int id;
    private String titolo;
    private String content;
    private String img;
    private String categoria;
    private User autore;
*/

create table news(
    id_news serial primary key,
    titolo varchar(100),
    content varchar(10000),
    img varchar(150),
    categoria varchar(50),
    autore bigint unsigned,
    foreign key (autore) references users(id_user) on update cascade on delete cascade
);


insert into users(name, surname, email, password, urlProfImg)
values ("user1", "cognome", "lol@lolololol.it", "password", "google.it");

insert into users(name, surname, email, password, urlProfImg)
values ("user2", "cognome", "lol@lolololol.it", "password", "google.it");

insert into users(name, surname, email, password, urlProfImg)
values ("user3", "cognome", "lol@lolololol.it", "password", "google.it");

insert into users(name, surname, email, password, urlProfImg)
values ("user4", "cognome", "lol@lolololol.it", "password", "google.it");
 
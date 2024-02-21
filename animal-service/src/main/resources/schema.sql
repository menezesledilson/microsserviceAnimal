Create table  animal(

    id int AUTO_INCREMENT NOT NULL ,
    nome_provisorio varchar(255) not null ,
    idade_estimada int not null,
    raca varchar(255) not null ,
    data_entrada date not null ,
    data_adocao date,
    condicoes_chegada varchar(255) not null ,
    nome_recebedor varchar(255) not null ,
    data_obito date,
    porte varchar(255) not null ,
    constraint pk_animal primary key (id)

);
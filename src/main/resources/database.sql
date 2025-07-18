    drop table if exists motor cascade 
    drop sequence if exists motor_seq
    create sequence motor_seq start with 1 increment by 50
    create table maquina (
        encendido boolean not null,
        potencias float(53),
        id bigint not null,
        marca varchar(255),
        primary key (id)
    )
/* define the schemas. */
create table campaign (
    contents_id char(10),
    title varchar(128),
    campaign_start date,
    campaign_end date,
    introduction_text text,
    main_image_url varchar(256),
    entry_url varchar(256),
    caution text,
    create_user varchar(256),
    create_date date,
    update_user varchar(256),
    update_date date,    
    constraint KEY_NAME primary key (
      contents_id
    )
);
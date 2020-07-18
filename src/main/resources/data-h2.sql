INSERT INTO postal_codes (code7, address1, address2, address3) select  '0640941', '北海道', '札幌市中央区', '旭ケ丘' where not exists (select * from postal_codes where code7 = '0640941');
INSERT INTO postal_codes (code7, address1, address2, address3) select  '0600041', '北海道', '札幌市中央区', '大通東' where not exists (select * from postal_codes where code7 = '0600041');

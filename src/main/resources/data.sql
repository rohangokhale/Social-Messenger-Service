-- People
INSERT INTO people (id, handle, name, password)
VALUES
    (1, 'dwight', 'Dwight Schrute','dwight'),
    (2, 'michael', 'Michael Scott', 'michael'),
    (3, 'jim', 'Jim Halpert', 'jim'),
    (4, 'pam', 'Pam Beesly', 'pam'),
    (5, 'creedthoughts', 'Creed Bratton', 'creedthoughts'),
    (6, 'kev','Kevin Malone', 'kev'),
    (7, 'catlover24', 'Angela Martin', 'catlover24'),
    (8, 'oscar', 'Oscar Martinez', 'oscar'),
    (9, 'stanley', 'Stanley Hudson', 'stanley'),
    (10, 'narddog', 'Andy Bernard', 'narddog');

-- Messages
INSERT INTO messages (person_id, content)
VALUES
    (1, 'R is among the most menacing of sounds. That''s why they call it murder and not mukduk.'),
    (2, 'I''m not superstitious, but I am a little stitious.'),
    (3, 'Fact, bears eat beets. Bears, beets, Battlestar Galactica.'),
    (4, 'You can''t be scared of a room full of Jims. I love the guy but he''s basically Gumby with hair.'),
    (5, 'If I can''t scuba, then what''s this all been about?'),
    (6, 'Mini cupcakes? As in the mini version of regular cupcakes? Which is already the mini version of cake?'),
    (7, 'I find the mystery genre disgusting. I hate being titillated.'),
    (8, 'Just saying it''s sterile doesn''t make it so.'),
    (9, 'I''m ok with the logic of it.'),
    (10, 'I cant''t tell if he''s mocking me.');

INSERT INTO messages (person_id, content)
VALUES
    (3, 'Pellentesque tincidunt tempus risus. Donec egestas. Duis ac arcu. Nunc'),
    (10, 'lobortis. Class aptent taciti sociosqu ad litora torquent per conubia'),
    (2, 'adipiscing elit. Curabitur sed tortor. Integer aliquam adipiscing lacus. Ut'),
    (4, 'est. Nunc ullamcorper, velit in aliquet lobortis, nisi nibh lacinia'),
    (6, 'mauris, aliquam eu, accumsan sed, facilisis vitae, orci. Phasellus dapibus'),
    (3, 'nascetur ridiculus mus. Proin vel nisl. Quisque fringilla euismod enim.'),
    (2, 'libero nec ligula consectetuer rhoncus. Nullam velit dui, semper et,'),
    (8, 'posuere at, velit. Cras lorem lorem, luctus ut, pellentesque eget,'),
    (2, 'Donec at arcu. Vestibulum ante ipsum primis in faucibus orci'),
    (6, 'eu, ultrices sit amet, risus. Donec nibh enim, gravida sit');

INSERT INTO messages (person_id, content)
VALUES
    (5, 'amet orci. Ut sagittis lobortis mauris. Suspendisse aliquet molestie tellus.'),
    (5, 'sem magna nec quam. Curabitur vel lectus. Cum sociis natoque'),
    (7, 'id, ante. Nunc mauris sapien, cursus in, hendrerit consectetuer, cursus'),
    (2, 'lectus pede, ultrices a, auctor non, feugiat nec, diam. Duis'),
    (5, 'elementum sem, vitae aliquam eros turpis non enim. Mauris quis'),
    (2, 'sapien. Aenean massa. Integer vitae nibh. Donec est mauris, rhoncus'),
    (4, 'ut ipsum ac mi eleifend egestas. Sed pharetra, felis eget'),
    (3, 'odio. Aliquam vulputate ullamcorper magna. Sed eu eros. Nam consequat'),
    (8, 'pretium et, rutrum non, hendrerit id, ante. Nunc mauris sapien,'),
    (2, 'in aliquet lobortis, nisi nibh lacinia orci, consectetuer euismod est');

INSERT INTO messages (person_id, content)
VALUES
    (9, 'torquent per conubia nostra, per inceptos hymenaeos. Mauris ut quam'),
    (3, 'Quisque nonummy ipsum non arcu. Vivamus sit amet risus. Donec'),
    (10, 'tincidunt orci quis lectus. Nullam suscipit, est ac facilisis facilisis,'),
    (10, 'ac, eleifend vitae, erat. Vivamus nisi. Mauris nulla. Integer urna.'),
    (9, 'est tempor bibendum. Donec felis orci, adipiscing non, luctus sit'),
    (5, 'cubilia Curae; Donec tincidunt. Donec vitae erat vel pede blandit'),
    (1, 'venenatis a, magna. Lorem ipsum dolor sit amet, consectetuer adipiscing'),
    (7, 'eu tempor erat neque non quam. Pellentesque habitant morbi tristique'),
    (6, 'id, libero. Donec consectetuer mauris id sapien. Cras dolor dolor,'),
    (3, 'mauris. Integer sem elit, pharetra ut, pharetra sed, hendrerit a,');

INSERT INTO messages (person_id, content)
VALUES
    (10, 'ipsum. Curabitur consequat, lectus sit amet luctus vulputate, nisi sem'),
    (2, 'pede, nonummy ut, molestie in, tempus eu, ligula. Aenean euismod'),
    (10, 'velit egestas lacinia. Sed congue, elit sed consequat auctor, nunc'),
    (3, 'metus. Aenean sed pede nec ante blandit viverra. Donec tempus,'),
    (10, 'ipsum leo elementum sem, vitae aliquam eros turpis non enim.'),
    (3, 'cubilia Curae; Phasellus ornare. Fusce mollis. Duis sit amet diam'),
    (7, 'risus. Duis a mi fringilla mi lacinia mattis. Integer eu'),
    (7, 'quam quis diam. Pellentesque habitant morbi tristique senectus et netus'),
    (4, 'Morbi non sapien molestie orci tincidunt adipiscing. Mauris molestie pharetra'),
    (5, 'Sed et libero. Proin mi. Aliquam gravida mauris ut mi.');

INSERT INTO messages (person_id, content)
VALUES
    (4, 'est, vitae sodales nisi magna sed dui. Fusce aliquam, enim'),
    (6, 'placerat. Cras dictum ultricies ligula. Nullam enim. Sed nulla ante,'),
    (1, 'elit, a feugiat tellus lorem eu metus. In lorem. Donec'),
    (9, 'molestie. Sed id risus quis diam luctus lobortis. Class aptent'),
    (4, 'sapien molestie orci tincidunt adipiscing. Mauris molestie pharetra nibh. Aliquam'),
    (8, 'Nullam feugiat placerat velit. Quisque varius. Nam porttitor scelerisque neque.'),
    (5, 'sit amet, consectetuer adipiscing elit. Curabitur sed tortor. Integer aliquam'),
    (6, 'sed tortor. Integer aliquam adipiscing lacus. Ut nec urna et'),
    (3, 'egestas ligula. Nullam feugiat placerat velit. Quisque varius. Nam porttitor'),
    (9, 'et magnis dis parturient montes, nascetur ridiculus mus. Proin vel');

INSERT INTO messages (person_id, content)
VALUES
    (4, 'sem. Nulla interdum. Curabitur dictum. Phasellus in felis. Nulla tempor'),
    (1, 'nunc id enim. Curabitur massa. Vestibulum accumsan neque et nunc.'),
    (4, 'enim consequat purus. Maecenas libero est, congue a, aliquet vel,'),
    (2, 'Cras convallis convallis dolor. Quisque tincidunt pede ac urna. Ut'),
    (6, 'tincidunt aliquam arcu. Aliquam ultrices iaculis odio. Nam interdum enim'),
    (10, 'aliquet diam. Sed diam lorem, auctor quis, tristique ac, eleifend'),
    (10, 'penatibus et magnis dis parturient montes, nascetur ridiculus mus. Proin'),
    (8, 'non sapien molestie orci tincidunt adipiscing. Mauris molestie pharetra nibh.'),
    (10, 'libero. Proin sed turpis nec mauris blandit mattis. Cras eget'),
    (7, 'dignissim. Maecenas ornare egestas ligula. Nullam feugiat placerat velit. Quisque');

INSERT INTO messages (person_id, content)
VALUES
    (7, 'at, velit. Cras lorem lorem, luctus ut, pellentesque eget, dictum'),
    (8, 'quis turpis vitae purus gravida sagittis. Duis gravida. Praesent eu'),
    (9, 'sit amet nulla. Donec non justo. Proin non massa non'),
    (2, 'eu turpis. Nulla aliquet. Proin velit. Sed malesuada augue ut'),
    (2, 'ante. Vivamus non lorem vitae odio sagittis semper. Nam tempor'),
    (1, 'diam. Duis mi enim, condimentum eget, volutpat ornare, facilisis eget,'),
    (7, 'risus. Nunc ac sem ut dolor dapibus gravida. Aliquam tincidunt,'),
    (2, 'massa. Mauris vestibulum, neque sed dictum eleifend, nunc risus varius'),
    (6, 'Phasellus at augue id ante dictum cursus. Nunc mauris elit,'),
    (4, 'dolor. Quisque tincidunt pede ac urna. Ut tincidunt vehicula risus.');

INSERT INTO messages (person_id, content)
VALUES
    (3, 'Nunc quis arcu vel quam dignissim pharetra. Nam ac nulla.'),
    (1, 'quam quis diam. Pellentesque habitant morbi tristique senectus et netus'),
    (3, 'dui nec urna suscipit nonummy. Fusce fermentum fermentum arcu. Vestibulum'),
    (7, 'natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.'),
    (1, 'ipsum primis in faucibus orci luctus et ultrices posuere cubilia'),
    (2, 'consequat dolor vitae dolor. Donec fringilla. Donec feugiat metus sit'),
    (9, 'aliquam eros turpis non enim. Mauris quis turpis vitae purus'),
    (9, 'Sed neque. Sed eget lacus. Mauris non dui nec urna'),
    (8, 'accumsan sed, facilisis vitae, orci. Phasellus dapibus quam quis diam.'),
    (2, 'luctus vulputate, nisi sem semper erat, in consectetuer ipsum nunc');

INSERT INTO messages (person_id, content)
VALUES
    (9, 'erat. Sed nunc est, mollis non, cursus non, egestas a,'),
    (8, 'libero lacus, varius et, euismod et, commodo at, libero. Morbi'),
    (10, 'et, lacinia vitae, sodales at, velit. Pellentesque ultricies dignissim lacus.'),
    (9, 'montes, nascetur ridiculus mus. Proin vel arcu eu odio tristique'),
    (7, 'lacus. Aliquam rutrum lorem ac risus. Morbi metus. Vivamus euismod'),
    (9, 'semper et, lacinia vitae, sodales at, velit. Pellentesque ultricies dignissim'),
    (7, 'non enim commodo hendrerit. Donec porttitor tellus non magna. Nam'),
    (4, 'nec, leo. Morbi neque tellus, imperdiet non, vestibulum nec, euismod'),
    (1, 'lectus justo eu arcu. Morbi sit amet massa. Quisque porttitor'),
    (4, 'pede sagittis augue, eu tempor erat neque non quam. Pellentesque');

INSERT INTO messages (person_id, content)
VALUES
    (3, 'ut, molestie in, tempus eu, ligula. Aenean euismod mauris eu'),
    (8, 'magnis dis parturient montes, nascetur ridiculus mus. Proin vel arcu'),
    (7, 'et, commodo at, libero. Morbi accumsan laoreet ipsum. Curabitur consequat,'),
    (1, 'ac sem ut dolor dapibus gravida. Aliquam tincidunt, nunc ac'),
    (4, 'tellus. Nunc lectus pede, ultrices a, auctor non, feugiat nec,'),
    (8, 'lorem, sit amet ultricies sem magna nec quam. Curabitur vel'),
    (1, 'ornare. Fusce mollis. Duis sit amet diam eu dolor egestas'),
    (4, 'ac tellus. Suspendisse sed dolor. Fusce mi lorem, vehicula et,'),
    (8, 'tellus id nunc interdum feugiat. Sed nec metus facilisis lorem'),
    (5, 'eu, placerat eget, venenatis a, magna. Lorem ipsum dolor sit');

INSERT INTO messages (person_id, content)
VALUES
    (6, 'Vivamus rhoncus. Donec est. Nunc ullamcorper, velit in aliquet lobortis,'),
    (3, 'dignissim. Maecenas ornare egestas ligula. Nullam feugiat placerat velit. Quisque'),
    (5, 'venenatis vel, faucibus id, libero. Donec consectetuer mauris id sapien.'),
    (3, 'mollis. Phasellus libero mauris, aliquam eu, accumsan sed, facilisis vitae,'),
    (10, 'ut, pellentesque eget, dictum placerat, augue. Sed molestie. Sed id'),
    (3, 'egestas. Fusce aliquet magna a neque. Nullam ut nisi a'),
    (7, 'neque sed dictum eleifend, nunc risus varius orci, in consequat'),
    (5, 'Cras interdum. Nunc sollicitudin commodo ipsum. Suspendisse non leo. Vivamus'),
    (2, 'Phasellus libero mauris, aliquam eu, accumsan sed, facilisis vitae, orci.'),
    (1, 'sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus');

-- Followers
INSERT INTO followers(person_id, follower_person_id)
VALUES
    (8, 4),
    (9, 4),
    (8, 1),
    (4, 10),
    (2, 6),
    (7, 5),
    (5, 6),
    (4, 5),
    (10, 1),
    (2, 4),
    (8, 3),
    (2, 8),
    (1, 10),
    (9, 6),
    (4, 6),
    (6, 4),
    (6, 9),
    (10, 2),
    (5, 9),
    (3, 7),
    (8, 6),
    (3, 5),
    (6, 3),
    (3, 9),
    (1, 8),
    (4, 9),
    (1, 5),
    (6, 2),
    (7, 2),
    (2, 9),
    (10, 8),
    (9, 3),
    (1, 3),
    (7, 4),
    (9, 7),
    (5, 1),
    (8, 10),
    (1, 6),
    (4, 7),
    (8, 5),
    (1, 9),
    (5, 3),
    (6, 7),
    (7, 8),
    (7, 3),
    (7, 6),
    (5, 10),
    (4, 1),
    (2, 7),
    (10, 6),
    (3, 4),
    (7, 10),
    (5, 7),
    (2, 1),
    (10, 9);

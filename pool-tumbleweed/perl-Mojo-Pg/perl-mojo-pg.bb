SUMMARY = "Wrapper around DBD::Pg for using PostgreSql with Mojolicious"
DESCRIPTION = "Mojo::Pg is a tiny wrapper around DBD::Pg that makes at \
http://www.postgresql.org a lot of fun to use with the at \
https://mojolicious.org real-time web framework. Perform queries blocking \
and non-blocking, use all at \
https://www.postgresql.org/docs/current/static/sql.html PostgreSQL has to \
offer, generate CRUD queries from data structures, manage your database \
schema with migrations and build scalable real-time web applications with \
the publish/subscribe pattern."
LICENSE = "Artistic-2.0"

PV = "5.0.0"

RPM_NAME = "perl-Mojo-Pg-5.0.0-1.3.noarch.rpm"
RPM_HASH = "04fcc598ce92f4a6bfa4d93bcaa4eca1058e5a5657fcc45c6b2de31c7b668926988b26d7ef246e25716ae947a5b62b7ad50abcf61c30338cf4564d194b14b9ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--Pg \
perl-Mojo--Pg--Database \
perl-Mojo--Pg--Migrations \
perl-Mojo--Pg--PubSub \
perl-Mojo--Pg--Results \
perl-Mojo--Pg--Transaction \
perl-Mojo-Pg"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DBD--Pg \
perl-Mojo--SQL \
perl-Mojolicious \
perl-SQL--Abstract--Pg"

inherit rpm

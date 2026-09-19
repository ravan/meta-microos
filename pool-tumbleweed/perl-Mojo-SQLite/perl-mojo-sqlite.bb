SUMMARY = "Tiny Mojolicious wrapper for SQLite"
DESCRIPTION = "Mojo::SQLite is a tiny wrapper around DBD::SQLite that makes at \
https://www.sqlite.org/ a lot of fun to use with the at https://mojolico.us \
real-time web framework. Use all at http://sqlite.org/lang.html SQLite has \
to offer, generate CRUD queries from data structures, and manage your \
database schema with migrations."
LICENSE = "Artistic-2.0"

PV = "4.0.0"

RPM_NAME = "perl-Mojo-SQLite-4.0.0-1.3.noarch.rpm"
RPM_HASH = "07905b2ab4901263f0c320c3d87bb6d7d611375d41a65a38f37a70748fac76259eb9cc6ce4d16036b90874d76792bb34d98000f56c8031f34598b81d5b02dc2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--SQLite \
perl-Mojo--SQLite--Database \
perl-Mojo--SQLite--Migrations \
perl-Mojo--SQLite--PubSub \
perl-Mojo--SQLite--Results \
perl-Mojo--SQLite--Transaction \
perl-Mojo-SQLite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DBD--SQLite \
perl-DBI \
perl-Mojolicious \
perl-SQL--Abstract--Pg \
perl-URI \
perl-URI--db \
perl-URI--file"

inherit rpm

SUMMARY = "PostgreSQL features for SQL::Abstract"
DESCRIPTION = "SQL::Abstract::Pg extends SQL::Abstract with a few PostgreSQL features used \
by Mojo::Pg."
LICENSE = "Artistic-2.0"

PV = "1.0.0"

RPM_NAME = "perl-SQL-Abstract-Pg-1.0.0-1.9.noarch.rpm"
RPM_HASH = "82a4896b6b87553ecdfd38098f6478952e20b212c3902d38767e747e0d2ce86285e7574c754c3d32189bd8980eed18e71afa208d27bd912c21c3b8dc9ff7bad9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SQL--Abstract--Pg \
perl-SQL-Abstract-Pg"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-SQL--Abstract"

inherit rpm

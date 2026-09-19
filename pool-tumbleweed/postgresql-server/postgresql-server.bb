SUMMARY = "The Programs Needed to Create and Run a PostgreSQL Server"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package includes the programs needed to create and run a \
PostgreSQL server, which will in turn allow you to create and maintain \
PostgreSQL databases."
LICENSE = "PostgreSQL"

PV = "18"

RPM_NAME = "postgresql-server-18-3.4.noarch.rpm"
RPM_HASH = "d94bfe6da5da7c58442bcb1d5cc424451b477239727a2ec0d8529130d07d77abff870537517b424f661ccd2c6117bc6b88e0db8f5653eecf1e86ff3b99c549cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-postgresql-server \
group-postgres \
postgresql-init \
postgresql-server \
postgresql-server-noarch \
user-postgres"

RDEPENDS:${PN} += "/usr/bin/sh \
postgresql \
postgresql-noarch \
postgresql-server-implementation \
sysuser-shadow"

inherit rpm

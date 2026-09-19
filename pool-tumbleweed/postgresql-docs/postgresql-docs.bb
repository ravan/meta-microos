SUMMARY = "HTML Documentation for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the HTML documentation for PostgreSQL. The start \
page is: file:///usr/share/doc/packages/postgresql/html/index.html . \
Manual pages for the PostgreSQL SQL statements can be found in the \
postgresql package."
LICENSE = "PostgreSQL"

PV = "18"

RPM_NAME = "postgresql-docs-18-3.4.noarch.rpm"
RPM_HASH = "dae3aca386de90618b5a3c72fa3f5f606125e0782c5cabe28225665fd712247e1f4e1be5c45f9904ad194a28cbc85034bf50e0b64cca074cccdbf50cc29ffd73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs \
postgresql-docs-noarch"

RDEPENDS:${PN} += "postgresql-docs-implementation"

inherit rpm

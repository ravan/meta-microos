SUMMARY = "Basic Clients and Utilities for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the basic utility and client programs necessary \
to maintain and work with local or remote PostgreSQL databases as well \
as manual pages for the SQL commands that PostgreSQL supports. Full \
HTML documentation for PostgreSQL can be found in the postgresql-docs \
package."
LICENSE = "PostgreSQL"

PV = "18"

RPM_NAME = "postgresql-18-3.4.noarch.rpm"
RPM_HASH = "0345aeec697d52cf2585c716605307bcb366afad097b1b8a118e5f999ae88fa450dfe8353e03401734f0c6c0089dba7e5feccdbe8e61d8ea3a1ffc1f12f6cc0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pg-alts \
postgresql \
postgresql-noarch"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
postgresql-implementation"

inherit rpm

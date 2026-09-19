SUMMARY = "Fast data loader for PostgreSQL"
DESCRIPTION = "pgloader imports data from different kind of sources and COPY it into \
PostgreSQL. \
 \
The command language is described in the manual page and allows to describe \
where to find the data source, its format, and to describe data processing \
and transformation. \
 \
Supported source formats include SQL Server, CSV, fixed width flat files, \
dBase3 files (DBF), and SQLite and MySQL databases. In most of those formats, \
pgloader is able to auto-discover the schema and create the tables and the \
indexes in PostgreSQL. In the MySQL case it's possible to edit CASTing rules \
from the pgloader command directly."
LICENSE = "PostgreSQL"

PV = "3.6.9"

RPM_NAME = "pgloader-3.6.9-4.7.aarch64.rpm"
RPM_HASH = "c51c8c9eada1ee924d9d2104aeece9eb1036dedae9c0334388e0d7e9b2d8b2b8d17e46f7f36868ba1be20f11d9c69a30284447ad04bc37f4487df13554570f9c"

RPROVIDES:${PN} += "pgloader"

RDEPENDS:${PN} += "/usr/bin/sbcl \
/usr/bin/sh"

inherit rpm

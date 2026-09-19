SUMMARY = "Tcl binding for SQLite"
DESCRIPTION = "This package contains laguage bindings from the Tcl programming \
language SQLite. \
 \
SQLite is a C library that implements an embeddable SQL database \
engine. Programs that link with the SQLite library can have SQL \
database access without running a separate RDBMS process."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "3.53.2"

RPM_NAME = "sqlite3-tcl-3.53.2-3.2.aarch64.rpm"
RPM_HASH = "118d7c58052767e12d8fbb04b826983e38bde45181a859c53637ee2679067bdac61d224d88cfacd58e6b57d0e2de4b6c729622e43e979ecb051c19358b3681b3"

RPROVIDES:${PN} += "libsqlite3.53.2.so \
sqlite3-tcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

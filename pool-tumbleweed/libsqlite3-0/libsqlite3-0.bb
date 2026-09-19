SUMMARY = "Shared libraries for the Embeddable SQL Database Engine"
DESCRIPTION = "This package contains the shared libraries for the Embeddable SQL \
Database Engine. \
 \
SQLite is a C library that implements an embeddable SQL database \
engine. Programs that link with the SQLite library can have SQL \
database access without running a separate RDBMS process. \
 \
SQLite is not a client library used to connect to a big database \
server. SQLite is a server and the SQLite library reads and writes \
directly to and from the database files on disk. \
 \
SQLite can be used via the sqlite command line tool or via any \
application that supports the Qt database plug-ins."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "3.53.2"

RPM_NAME = "libsqlite3-0-3.53.2-3.2.aarch64.rpm"
RPM_HASH = "f6de5f0aea0f2422613df3b446083f35e7484fd7da2716a5ef11ee264c613afb1d4e15dd942a654725ccdc89ed9a1e28bb55f179b270b1a0746fb4bd4cca055a"

RPROVIDES:${PN} += "libsqlite3-0 \
libsqlite3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

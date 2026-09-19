SUMMARY = "Embeddable SQL Database Engine"
DESCRIPTION = "SQLite is a C library that implements an embeddable SQL database \
engine. Programs that link with the SQLite library can have SQL \
database access without running a separate RDBMS process. \
 \
SQLite is not a client library used to connect to a big database \
server; SQLite is the server. The SQLite library reads and writes \
directly to and from the database files on disk. \
 \
SQLite can be used via the sqlite command-line tool or via any \
application which supports the Qt database plug-ins."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "3.53.2"

RPM_NAME = "sqlite3-devel-3.53.2-3.2.aarch64.rpm"
RPM_HASH = "832c788a62346ec66a6d7ab148b7d82ecfa8dbee8cc55c1d8850d1cb1d9bb62493964e867fd17198140d1727412d848e3066fcc088e616ee22f1516f0a79f691"

RPROVIDES:${PN} += "pkgconfig-sqlite3 \
sqlite-devel \
sqlite3-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libsqlite3-0"

inherit rpm

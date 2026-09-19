SUMMARY = "Embeddable SQL Database Engine"
DESCRIPTION = "SQLite is a C library that implements an embeddable SQL database \
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

RPM_NAME = "sqlite3-3.53.2-3.2.aarch64.rpm"
RPM_HASH = "a68e9d5bd30c24997725a36079b107d1eb2954f626490b5e6c1ce808e00e2d286b0c43f6881f2b8229d5749bc9801dc8b24cfd3b7a4eaddbe9a8a1ecd6c72e22"

RPROVIDES:${PN} += "sqlite \
sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libreadline.so.8 \
libz.so.1"

inherit rpm

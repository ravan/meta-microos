SUMMARY = "All files necessary for development with the MDB Tools libraries"
DESCRIPTION = "Mdbtools contains: \
mdb-dump -- simple hex dump utility for looking at mdb files \
mdb-schema -- prints DDL for the specified table \
mdb-export -- export table to CSV format \
mdb-tables -- a simple dump of table names to be used with shell scripts \
mdb-header -- generates a C header to be used in exporting mdb data to a C prog \
mdb-parsecvs -- generates a C program given a CSV file made with mdb-export \
mdb-sql -- demo SQL engine program \
mdb-ver -- print version of database"
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "mdbtools-devel-1.0.1-1.6.aarch64.rpm"
RPM_HASH = "e2ecfe46a6d32240bf97c15c8df31a32a6fce49d30e3306c6e8021f24fdec035b07460042a56730f18a43df9217c6559e20aa249a041b0f760905b76aace5885"

RPROVIDES:${PN} += "libmdbodbc.so \
libmdbodbcW.so \
mdbtools-devel \
pkgconfig-libmdb \
pkgconfig-libmdbsql"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libmdb.so.3 \
libmdb3 \
libmdbsql.so.3 \
libmdbsql3 \
libodbcinst.so.2 \
pkgconfig-glib-2.0 \
pkgconfig-libmdb"

inherit rpm

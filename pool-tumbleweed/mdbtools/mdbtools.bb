SUMMARY = "A Suite of Libraries and Programs to Access Microsoft Access Databases"
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

RPM_NAME = "mdbtools-1.0.1-1.6.aarch64.rpm"
RPM_HASH = "93d691596662cea7ba239ab7e0e0e9e5ad7f211ee6ccd56671224c697b3a10c074cf4c816439433f6d1a6281869d35f6284f7301c82bda650ee1f84ec4c40155"

RPROVIDES:${PN} += "mdbtools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libmdb.so.3 \
libmdbsql.so.3 \
libreadline.so.8"

inherit rpm

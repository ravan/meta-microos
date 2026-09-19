SUMMARY = "MySQL based virtual hosts module for Lighttpd"
DESCRIPTION = "With MySQL based vhosting you can put the information where to look for \
the document-root of a given host into a MySQL database."
LICENSE = "BSD-3-Clause"

PV = "1.4.85"

RPM_NAME = "lighttpd-mod_vhostdb_mysql-1.4.85-1.2.aarch64.rpm"
RPM_HASH = "059681d68dbc7962d2c4c9ae87ede858e4200a21c7da2d6e9feeb211b6a0f7a540034f667804d0c6eb6519771cc7059204dcbf42dd00a1122a7b06653b246acc"

RPROVIDES:${PN} += "lighttpd-mod-vhostdb-mysql"

RDEPENDS:${PN} += "libc.so.6 \
libmariadb.so.3 \
lighttpd"

inherit rpm

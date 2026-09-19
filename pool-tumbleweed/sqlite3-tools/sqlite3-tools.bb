SUMMARY = "Command line interface for SQLite 3 (tools)"
DESCRIPTION = "This package contains the extra CLI tools from sqlite3 source code. \
Namely, these are showdb, showjournal, showstat4, showwal, sqldiff, \
and sqlite3_rsync."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "3.53.2"

RPM_NAME = "sqlite3-tools-3.53.2-3.2.aarch64.rpm"
RPM_HASH = "0fba0e338e0415c8189c7e13d5b81d6d23b9c601a7837cd6415b76e70e5ff3346499bf2e7081a74e821adaab6e9d0f7df9994e0ad21d5d33cd2815c13184d419"

RPROVIDES:${PN} += "sqlite3-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

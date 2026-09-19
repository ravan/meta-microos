SUMMARY = "Database for recording the last logged in users and system reboots"
DESCRIPTION = "pam_wtmpdb and wtmpdb are Y2038-safe versions of wtmp and the last \
utility. pam_wtmpdb collects all data in a sqlite3 database and the \
wtmpdb utility creates boot and shutdown entries or formats and \
prints the contents of the wtmp database."
LICENSE = "BSD-2-Clause"

PV = "0.76.0+git20260730.89c0861"

RPM_NAME = "wtmpdb-0.76.0+git20260730.89c0861-1.1.aarch64.rpm"
RPM_HASH = "0ae5e5ebd0ca8aa1a5e76ea313ba74d3b8d68c847f5b6d114d078930112b618e1b6a30b0417cfcc4e0a795cb2223dfa8d1d587dd59089c4d8c38da12186046ba"

RPROVIDES:${PN} += "util-linux-/usr/bin/last \
wtmpdb"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libpam.so.0 \
libsystemd.so.0 \
libwtmpdb.so.0 \
pam-config"

inherit rpm

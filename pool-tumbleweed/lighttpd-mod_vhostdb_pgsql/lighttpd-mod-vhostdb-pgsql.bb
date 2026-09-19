SUMMARY = "PostgreSQL based virtual hosts module for Lighttpd"
DESCRIPTION = "With PostgreSQL based vhosting you can put the information where to look \
for the document-root of a given host into a PostgreSQL database."
LICENSE = "BSD-3-Clause"

PV = "1.4.85"

RPM_NAME = "lighttpd-mod_vhostdb_pgsql-1.4.85-1.2.aarch64.rpm"
RPM_HASH = "71d7e0bbf860ba7ec491776820a69c76a8d340c5adcf1a30c090bcf664fd562eac466e0117950c5d9c31449d03d744f15957bec99214f25edb1cf0ffc156483f"

RPROVIDES:${PN} += "lighttpd-mod-vhostdb-pgsql"

RDEPENDS:${PN} += "libc.so.6 \
libpq.so.5 \
lighttpd"

inherit rpm

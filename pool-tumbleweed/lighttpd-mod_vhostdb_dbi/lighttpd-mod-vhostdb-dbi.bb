SUMMARY = "DBI based virtual hosts module for Lighttpd"
DESCRIPTION = "With DBI based vhosting you can put the information where to look for \
the document-root of a given host into any DBI supported database."
LICENSE = "BSD-3-Clause"

PV = "1.4.85"

RPM_NAME = "lighttpd-mod_vhostdb_dbi-1.4.85-1.2.aarch64.rpm"
RPM_HASH = "11d666998e942f2b9718586021cb4000a32e7fdee117172960df2279cdba93c1a900e65a99e347cd6f1665ac1eead303890071caf5ab850983932a706a0092e3"

RPROVIDES:${PN} += "lighttpd-mod-vhostdb-dbi"

RDEPENDS:${PN} += "libc.so.6 \
libdbi.so.3 \
lighttpd"

inherit rpm

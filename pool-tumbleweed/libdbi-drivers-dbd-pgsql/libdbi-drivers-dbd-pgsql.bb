SUMMARY = "PostgreSQL driver for libdbi"
DESCRIPTION = "This driver provides connectivity to PostgreSQL database servers \
through the libdbi database independent abstraction layer. Switching \
a program's driver does not require recompilation or rewriting source \
code."
LICENSE = "LGPL-2.1+"

PV = "0.9.0.g53"

RPM_NAME = "libdbi-drivers-dbd-pgsql-0.9.0.g53-4.8.aarch64.rpm"
RPM_HASH = "2ca266e072b89ad55b2c9209d70a2718a11b8c63d8ef5112180264eca810ae4fc04f8187fc8be50ce78368547d81f6e91fcb74093d7fa0571028a9df3c661370"

RPROVIDES:${PN} += "libdbdpgsql.so \
libdbi-drivers-dbd-pgsql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbi.so.3 \
libpq.so.5"

inherit rpm

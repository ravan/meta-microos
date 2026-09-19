SUMMARY = "Library implementing the distributed SQLite"
DESCRIPTION = "dqlite is a C library implementing an embeddable and replicated \
SQL database engine with high-availability and automatic failover. \
 \
dqlite extends SQLite with a network protocol that can connect \
together various instances of an application and have them act as a \
highly-availablity cluster."
LICENSE = "LGPL-3.0-only-with-LGPL-3.0-linking-exception"

PV = "1.18.6"

RPM_NAME = "libdqlite0-1.18.6-1.3.aarch64.rpm"
RPM_HASH = "9c0980fbb6417e456c327afd471e479b19298fb5f95443e8fc7eb7834e4a0f46c53836c053ef3ade73461397f198c56d25b94dd83778fa696520f28303b412c6"

RPROVIDES:${PN} += "libdqlite.so.0 \
libdqlite0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblz4.so.1 \
libsqlite3.so.0 \
libuv.so.1"

inherit rpm

SUMMARY = "Utilities to work with RDF data"
DESCRIPTION = "Utilities to work with RDF data. \
Sord is a lightweight C library for storing RDF data in memory."
LICENSE = "ISC"

PV = "0.16.22"

RPM_NAME = "sord-0.16.22-1.3.aarch64.rpm"
RPM_HASH = "585b26e81291af3d19b42ed96ee96728f376ec821bca545d2138a1d5f074fd09659b6904fe8f5f962759721b01801805f9530ee200b2d1b4c3b1f5f61dff3c4a"

RPROVIDES:${PN} += "sord"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0 \
libserd-0.so.0 \
libsord-0.so.0 \
libzix-0.so.0"

inherit rpm

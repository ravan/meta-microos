SUMMARY = "A lightweight C library for storing RDF data in memory"
DESCRIPTION = "A lightweight C library for storing RDF data in memory. \
http://drobilla.net/software/sord/"
LICENSE = "ISC"

PV = "0.16.22"

RPM_NAME = "libsord-0-0-0.16.22-1.3.aarch64.rpm"
RPM_HASH = "a7ec8ac61882f73d7cbc225da5d9a3ea0c1cd423dd1c9be820eb5f4652c0964f9449b01acf9bc66ad2ca0fc8cb6fbf8b88c70318832d5e35b7b2d5dbbcc90dc5"

RPROVIDES:${PN} += "libsord-0-0 \
libsord-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libserd-0.so.0 \
libzix-0.so.0"

inherit rpm

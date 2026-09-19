SUMMARY = "Library for Handling of Gadu-Gadu Instant Messaging"
DESCRIPTION = "libgadu is a library for handling of protocol of a popular Polish \
instant messenger Gadu-Gadu."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.2"

RPM_NAME = "libgadu3-1.12.2-2.29.aarch64.rpm"
RPM_HASH = "a3c58d449e41739af8a905951475862ecbabde801908dcd7ce224b5b8ecca941d10c8eabe71f2ace99bb2127a11bcf7caa27547adb7cdea250881c3cf40a6162"

RPROVIDES:${PN} += "libgadu \
libgadu.so.3 \
libgadu3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libprotobuf-c.so.1 \
libz.so.1"

inherit rpm

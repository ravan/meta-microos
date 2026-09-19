SUMMARY = "Generic Spell Checking Library"
DESCRIPTION = "A library providing an efficient extensible abstraction for dealing \
with different spell checking libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.1"

RPM_NAME = "libenchant1-1.6.1-8.10.aarch64.rpm"
RPM_HASH = "2d69c9d2d0d5db75369949e0e8700820773ea7003bf00502e8b3bf19da214995d831b43568cd02a34371582c2122ee6b224ad4bc9ebfa201e870aa718cee11e1"

RPROVIDES:${PN} += "enchant \
libenchant.so.1 \
libenchant1"

RDEPENDS:${PN} += "/sbin/ldconfig \
enchant-1-backend \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0"

inherit rpm

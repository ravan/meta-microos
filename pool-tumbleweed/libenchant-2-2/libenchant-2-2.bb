SUMMARY = "Generic Spell Checking Library"
DESCRIPTION = "A library providing an efficient extensible abstraction for dealing \
with different spell checking libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.8.19"

RPM_NAME = "libenchant-2-2-2.8.19-1.1.aarch64.rpm"
RPM_HASH = "841c3e873a31dfca5cc1bc010bf9638e927a6581439b4f3f276f04d2a22f1bd8dd81cea1ad7af788686d433bc4aaabef640fde4b4256f0ebbf36b129dc4b8f14"

RPROVIDES:${PN} += "libenchant-2-2 \
libenchant-2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
enchant-2-backend \
enchant-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm

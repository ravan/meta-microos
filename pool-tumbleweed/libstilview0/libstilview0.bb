SUMMARY = "A library to play Commodore 64 music"
DESCRIPTION = "A library to play Commodore 64 music based on libsidplay2."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.1"

RPM_NAME = "libstilview0-3.1.1-1.1.aarch64.rpm"
RPM_HASH = "4f01c47ed5cdef8747548128b069759d73fca1da7b8b83f381d5cde3d59f92befa493eaa305a9f6affdd3482a44b82c6990a77478abc1aa63ef9b1a545030eea"

RPROVIDES:${PN} += "libstilview.so.0 \
libstilview0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

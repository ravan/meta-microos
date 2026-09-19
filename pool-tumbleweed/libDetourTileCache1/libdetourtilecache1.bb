SUMMARY = "Detour Tile Cache Library for Recastnatnaviagtion"
DESCRIPTION = "This package contains the detour tile cache library part of Recastnatnaviagtion."
LICENSE = "Zlib"

PV = "1.6.0"

RPM_NAME = "libDetourTileCache1-1.6.0-1.9.aarch64.rpm"
RPM_HASH = "3b81818ee87340e87bcbeb7d221b229e1a3da2f40e604ec15d3f0b09dbd62ff5725d3d6eeeb217db5642aa6905826e6c3f9ce86b0f737eccdbd4cabaad8c8902"

RPROVIDES:${PN} += "libDetourTileCache.so.1 \
libDetourTileCache1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libDetour.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

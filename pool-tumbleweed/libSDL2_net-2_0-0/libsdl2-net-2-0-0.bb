SUMMARY = "Simple DirectMedia Layer 2 – Networking library"
DESCRIPTION = "This is a networking library for use with SDL."
LICENSE = "Zlib"

PV = "2.4.0"

RPM_NAME = "libSDL2_net-2_0-0-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "12f0bf94320fba9d356b2b4df9d3f78454fe90b3fec0e0cb6dcc7a73ffb40c342b7722b401c334c0f4ed920d65ea389693073f740b32037852c2e84336536d5f"

RPROVIDES:${PN} += "SDL2-net \
libSDL2-net-2-0-0 \
libSDL2-net-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6"

inherit rpm

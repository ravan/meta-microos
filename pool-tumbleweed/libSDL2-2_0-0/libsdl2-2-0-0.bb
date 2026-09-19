SUMMARY = "SDL-2.0 Compatibility Layer for Simple DirectMedia Layer 3.0"
DESCRIPTION = "This is the 'Simple DirectMedia Layer' library built from sdl2-compat. \
it provides a binary and source compatible API for programs written \
against SDL 2.0, but it uses SDL 3.0 behind the scenes."
LICENSE = "Zlib"

PV = "2.32.72"

RPM_NAME = "libSDL2-2_0-0-2.32.72-1.1.aarch64.rpm"
RPM_HASH = "e65d0a1741630dd3f9081c89d1ff44503e6f5447115a8a046ab0b0a2c89d32bc7f787a66d7e85297fbb06b1de49f6be09df6692933d3d5199262aed6d59421a1"

RPROVIDES:${PN} += "libSDL2-2-0-0 \
libSDL2-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL3.so.0 \
libc.so.6"

inherit rpm

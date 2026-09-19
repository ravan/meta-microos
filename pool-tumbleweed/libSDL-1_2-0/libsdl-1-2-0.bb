SUMMARY = "SDL Graphics Routines for Primitives and Other Support Functions"
DESCRIPTION = "This is the 'Simple DirectMedia Layer' library built from sdl12_compat. \
it provides a binary and source compatible API for programs written \
against SDL 1.2, but it uses SDL 2.0 behind the scenes."
LICENSE = "(MIT-0 | Unlicense) & Zlib & MIT"

PV = "1.2.76"

RPM_NAME = "libSDL-1_2-0-1.2.76-1.8.aarch64.rpm"
RPM_HASH = "231853f50983aa417d7ccea473b0ad3d2f65f4af900a6a34352160d939ff65d030d2a2b0bdff019da8852d59449c7bbe7a107116082a9f8136d11e274944dbc9"

RPROVIDES:${PN} += "libSDL-1-2-0 \
libSDL-1.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2-0-0 \
libc.so.6"

inherit rpm

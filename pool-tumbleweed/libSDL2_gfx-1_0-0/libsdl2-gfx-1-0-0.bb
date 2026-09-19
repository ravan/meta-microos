SUMMARY = "SDL2 Graphics Routines for Primitives and Other Support Functions"
DESCRIPTION = "Library containing 20+ graphics primitives (line, box, circle, polygon, etc.) for SDL2."
LICENSE = "Zlib"

PV = "1.0.4"

RPM_NAME = "libSDL2_gfx-1_0-0-1.0.4-3.4.aarch64.rpm"
RPM_HASH = "effdfa0c28d74aafe69ed5ad6a982077d89a154fe9ae25549690fe7dd7280e2336cdfab8e0e8ef9f42efd90cc5d927564f28cd9acec7a4d4a0c585e0b5f2738a"

RPROVIDES:${PN} += "SDL2-gfx \
libSDL2-gfx-1-0-0 \
libSDL2-gfx-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6"

inherit rpm

SUMMARY = "SDL Graphics Routines for Primitives and Other Support Functions"
DESCRIPTION = "The SDL_gfx library evolved out of the SDL_gfxPrimitives code which \
provided basic drawing routines such as lines, circles or polygons and \
SDL_rotozoom which implemented a interpolating rotozoomer for SDL \
surfaces."
LICENSE = "Zlib"

PV = "2.0.27"

RPM_NAME = "libSDL_gfx16-2.0.27-1.9.aarch64.rpm"
RPM_HASH = "486ea98f7da79b942d26c6109c8ef4d2470b15de57e35dae4b30cd668987c69d959c7ff8c72c25de6cff5a19b668a367108bb90ee08844427cf1b7c53c1ea404"

RPROVIDES:${PN} += "SDL-gfx \
libSDL-gfx.so.16 \
libSDL-gfx16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm

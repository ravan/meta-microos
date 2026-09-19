SUMMARY = "Implementation of the arcade classic Puzznic"
DESCRIPTION = "Wizznic is a brick-matching puzzle-game, an improved version of Puzznic. \
The challenge is to clear each level of bricks by moving the bricks next \
to each other, this sounds a lot easier than it is. \
The bricks are heavy, so you can only push them, not lift them up."
LICENSE = "GPL-3.0-only"

PV = "1.1"

RPM_NAME = "wizznic-1.1-3.5.aarch64.rpm"
RPM_HASH = "baca9fb4ac805756d39243a1721eaa96d1adbd6d693edd82d117eadbafec3c012075c0fe9dab44e165a5729ad56019121c3d92b4e9e778cca41ae79a2352396b"

RPROVIDES:${PN} += "wizznic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm

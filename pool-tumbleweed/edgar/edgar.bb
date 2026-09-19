SUMMARY = "2D platform game with a persistent world"
DESCRIPTION = "The Legend of Edgar is a platform game, not unlike those found on the Amiga and \
SNES. Edgar must battle his way across the world, solving puzzles and defeating \
powerful enemies to achieve his quest. \
 \
A 2D platform game with a persistent world. \
When Edgar's father fails to return home after venturing out one dark and stormy \
night, Edgar fears the worst: he has been captured by the evil sorcerer who \
lives in a fortress beyond the forbidden swamp. \
 \
Donning his armour, Edgar sets off to rescue him, but his quest will not be \
easy..."
LICENSE = "GPL-2.0-or-later"

PV = "1.38"

RPM_NAME = "edgar-1.38-1.5.aarch64.rpm"
RPM_HASH = "030d343b33f782f6d8c4cbad48a54276e27ce66e67bf9f826bc8edddbe7473524e24827cd12bd3347e4358984df02e9171576dd1d8cdd1e6c488b92ec5842c34"

RPROVIDES:${PN} += "edgar"

RDEPENDS:${PN} += "edgar-data \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libm.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm

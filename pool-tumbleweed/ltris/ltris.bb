SUMMARY = "Tetris Clone with Multiplayer and CPU Opponents"
DESCRIPTION = "LTris is a very polished Tetris clone. It is highly configurable due to \
its menu. It offers the well-known game type Classic, a funny game type \
Figures (a new figure each level, suddenly appearing tiles and lines), \
and multiplayer with up to three players either human or CPU \
controlled."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "ltris-1.3.2-1.8.aarch64.rpm"
RPM_HASH = "9276f6509668da0d37e6d13595a40c4c5db02388275460614d3c5582ab2c460263678f4fc93fe06982a787dbc14bd8ce70cf66b539f30efbb6fa30a0905808c1"

RPROVIDES:${PN} += "ltris"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6"

inherit rpm

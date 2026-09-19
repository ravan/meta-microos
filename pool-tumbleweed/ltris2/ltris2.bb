SUMMARY = "Tetris Clone with Multiplayer and CPU Opponents"
DESCRIPTION = "LTris2 is a highly configurable, polished, HD-screen ready Tetris clone. It \
offers the well-known Classic game, a funny game type Figures (a new figure \
each level, suddenly appearing tiles and lines), and multiplayer against up \
to two CPU players or human versus human."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.4"

RPM_NAME = "ltris2-2.0.4-2.3.aarch64.rpm"
RPM_HASH = "56394353f9f307f672300b6c5e67f1e95040ee84e2e5a1428e188c3fe2542a876df956cd31e7033eb834678c8aa36dbf1cd68988f475a65fb7e554ec3f724bbc"

RPROVIDES:${PN} += "ltris2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

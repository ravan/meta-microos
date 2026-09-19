SUMMARY = "3D mini golf game"
DESCRIPTION = "A hot-seat multiplayer miniature golf game, built on the physics \
and graphics engine of Neverball. \
 \
Based on the physics and graphics of Neverball, Neverputt is a hot-seat \
multi-player miniature golf game for 1 to 4 players. The available \
courses take advantage of all the elements that challenge Neverball \
players, including moving platforms and barriers, teleporters, ramps, \
and drop-offs. A simple putting interface and golf scoring system \
have been added."
LICENSE = "GPL-2.0-or-later"

PV = "1.6+git.20240820"

RPM_NAME = "neverball-neverputt-1.6+git.20240820-1.2.aarch64.rpm"
RPM_HASH = "934a44f785948ba7bcbb3ab638f99c4df4d52ded5fd43b3d4b7c565a0310e8335ea0106367fd92270a1ce6a6bffbb5dd843e80cd32c7644c23c3dfe12db7aff2"

RPROVIDES:${PN} += "neverball-neverputt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libvorbisfile.so.3 \
neverball"

inherit rpm

SUMMARY = "Classic overhead run-and-gun game"
DESCRIPTION = "C-Dogs SDL is a classic overhead run-and-gun game, supporting up to \
4 players in co-op and deathmatch modes. Customize your player, choose \
from up to 11 weapons, and try over 100 user-created campaigns. Have fun!"
LICENSE = "BSD-2-Clause & GPL-2.0-only & CC-BY-3.0 & CC-BY-SA-3.0"

PV = "2.4.0"

RPM_NAME = "cdogs-sdl-2.4.0-2.1.aarch64.rpm"
RPM_HASH = "66a134083412ce2bc7a995c52467fa4193d909a6f007cfd573a8fae1b2c9414de69dc6e8be1333ca67d15ab6d5befefdf6d003622a50b88e213d71936d6c0b68"

RPROVIDES:${PN} += "cdogs-sdl"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libOpenGL.so.0 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libc.so.6 \
libenet.so.7 \
libm.so.6"

inherit rpm

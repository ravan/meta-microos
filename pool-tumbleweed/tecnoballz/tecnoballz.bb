SUMMARY = "A brick breaking game"
DESCRIPTION = "A brick breaker with 50 levels of game and 11 special levels, \
distributed on the 2 modes of game to give the player a sophisticated system \
of attack weapons with an enormous firepower that can be built by \
gaining bonuses.  Numerous decors, music and sounds complete this \
game. This game was ported from the Commodore Amiga."
LICENSE = "GPL-3.0-only"

PV = "0.93.1"

RPM_NAME = "tecnoballz-0.93.1-5.13.aarch64.rpm"
RPM_HASH = "a51dfb1a898df98fbca1bbce0579407e3eff0bd56241418b8f196dcf7e2d60c201dc5a3f07a422cc34f9bcb07c7f0fadd6b49427b1f61501b7bf6b80f7572850"

RPROVIDES:${PN} += "tecnoballz"

RDEPENDS:${PN} += "group-games \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmikmod.so.3 \
libstdc++.so.6 \
libtinyxml.so.0 \
user-games"

inherit rpm

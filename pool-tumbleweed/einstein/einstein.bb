SUMMARY = "Einstein's Puzzle"
DESCRIPTION = "Einstein's Puzzle is a logic game based on Einstein's famous riddle. \
The game goal is to open all cards in square of 6x6 cards. \
For this, a number of hints describing relations between card positions are given."
LICENSE = "GPL-2.0-or-later"

PV = "2.0"

RPM_NAME = "einstein-2.0-1.1.aarch64.rpm"
RPM_HASH = "e28d5354288fc84463555570d7c195ad49f5e28081646bea036e784af13b7a842324e0eaf4191e256f11260d5dbdb2d6b0eee58b2d46e2dee6ccee45bbafc819"

RPROVIDES:${PN} += "einstein"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libSDL-ttf-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

SUMMARY = "Helper library allowing to equip any game with GameMode support"
DESCRIPTION = "GameMode is a daemon/lib combo for Linux that allows games to request \
a set of optimisations be temporarily applied to the host OS. \
 \
Libgamemodeauto allows you to use GameMode with any Game by \
preloading it into the game. \
 \
    LD_PRELOAD=/usr/lib64/libgamemodeauto.so.0 ./game \
 \
For Steam games this can be done by editing the launch options: \
 \
    LD_PRELOAD=$LD_PRELOAD:/usr/lib64/libgamemodeauto.so.0 %command% \
 \
Nowadays this however can be easier done by using the gamemoderun command \
from the gamemode package."
LICENSE = "BSD-3-Clause"

PV = "1.8.2"

RPM_NAME = "libgamemodeauto0-1.8.2-1.9.aarch64.rpm"
RPM_HASH = "81c69e338b14e3091c24d4c578d4be9d9046e4267314d9106525710cf39516f14d4855657f2da13d8b01de69a7b26d4813d5c89000e68e7408bd7eb5b21a64f9"

RPROVIDES:${PN} += "libgamemodeauto.so.0 \
libgamemodeauto0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgamemode0"

inherit rpm

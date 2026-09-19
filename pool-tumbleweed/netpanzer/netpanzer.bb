SUMMARY = "An Online Multiplayer Tactical Warfare Game"
DESCRIPTION = "netPanzer is an online multiplayer tactical warfare game designed for FAST \
ACTION combat. Gameplay concentrates on the core -- no resource management is \
needed. The game is based on quick tactical action and unit management in \
real-time. Battles progress quickly and constantly as destroyed players respawn \
with a set of new units. Players can join or leave multiplayer games at any \
time."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.1"

RPM_NAME = "netpanzer-0.9.1-1.3.aarch64.rpm"
RPM_HASH = "850c5024ffb92fbbf5ddfe49abd4b0bf1e3440d5d6ed960d31d851dcddf503c9835f50f4f45fa7194d91c8132f6837abc82fb2bab956ef2d2ce3d419dfc568d2"

RPROVIDES:${PN} += "netpanzer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libphysfs.so.1 \
libstdc++.so.6"

inherit rpm

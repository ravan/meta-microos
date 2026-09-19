SUMMARY = "Realtime strategy game involving map control"
DESCRIPTION = "Widelands is a real-time strategy (RTS) game with singleplayer \
campaigns and a multiplayer mode. The game was inspired by Settlers II \
(Bluebyte) but has significantly more variety and depth to it. \
 \
The primary goal of this type of RTS is to build a settlement with a \
functioning economy, producing sufficient military units so as to \
conquer rival territories, ultimately gaining control of either the \
entire map, or a certain predetermined section of it."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1"

RPM_NAME = "widelands-1.3.1-1.5.aarch64.rpm"
RPM_HASH = "4b4e0ecfdc68f0492af68b8bc007c4f97d18d738981a5ab7d18311ef25a208e94e0455201888a4c65f1b7c532977dc466a91105921b19e7d1d3542022cf7a3be"

RPROVIDES:${PN} += "widelands"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libglbinding.so.3 \
libicuuc.so.78 \
libm.so.6 \
libminizip.so.1 \
libpng16.so.16 \
libstdc++.so.6 \
widelands-data"

inherit rpm

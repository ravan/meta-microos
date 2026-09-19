SUMMARY = "A retro multiplayer jump-and-swing shooter"
DESCRIPTION = "Teeworlds is an online multiplayer game. Battles can be played with \
up to 16 players in a variety of game modes, including Team \
Deathmatch and Capture The Flag. Own maps can be designed."
LICENSE = "CC-BY-SA-3.0 & Zlib"

PV = "0.7.5"

RPM_NAME = "teeworlds-0.7.5-3.17.aarch64.rpm"
RPM_HASH = "022308046c3f8a3f4078499f311105f1335ede41f591007fed5c662904c01abf56628de8e5d1c1b6cdbb1018399850fc536ec3215fb93acd84128e0c44d4d78b"

RPROVIDES:${PN} += "teewars \
teeworlds"

RDEPENDS:${PN} += "dejavu-fonts \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libcrypto.so.3 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpnglite.so.0 \
libstdc++.so.6 \
libwavpack.so.1 \
libz.so.1"

inherit rpm

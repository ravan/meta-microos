SUMMARY = "A InfiniMiner/Minecraft inspired game"
DESCRIPTION = "An infinite-world block sandbox game and a game engine, inspired by \
InfiniMiner, Minecraft and the like."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.1-or-later"

PV = "5.17.0"

RPM_NAME = "luanti-5.17.0-1.2.aarch64.rpm"
RPM_HASH = "e2b0855351dc74f9b97bca5de575bbb277dc6092b81b7d1a645856eecee6c9cea46ef8746a228e5b00d6f7fe72fc54fae30466b7eaad96378b165a98af3e4b3e"

RPROVIDES:${PN} += "luanti \
luanti-runtime \
minetest \
minetest-runtime"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libOpenGL.so.0 \
libSDL2-2.0.so.0 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libhiredis.so.1.3.0 \
libjpeg.so.8 \
libjsoncpp.so.27 \
libleveldb.so.1 \
libluajit-5.1.so.2 \
libm.so.6 \
libncursesw.so.6 \
libopenal.so.1 \
libpng16.so.16 \
libpq.so.5 \
libspatialindex.so.8 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtinfo.so.6 \
libvorbisfile.so.3 \
libz.so.1 \
libzstd.so.1 \
luanti-data \
opengl-games-utils"

inherit rpm

SUMMARY = "Luanti server"
DESCRIPTION = "An infinite-world block sandbox game and a game engine, inspired by \
InfiniMiner, Minecraft and the like. \
 \
This package contains a luanti server."
LICENSE = "LGPL-2.1-or-later"

PV = "5.17.0"

RPM_NAME = "luantiserver-5.17.0-1.2.aarch64.rpm"
RPM_HASH = "8235570e060f71ee8ac3b9bbed5e8b1567762b397a47401ac1376cdb60fe4dcfd9ca4618ecbb0087882392b90d7fc4d4fe04b0ba3ebe348b148c4a05e2e2e338"

RPROVIDES:${PN} += "config-luantiserver \
group-luanti \
luanti-runtime \
luantiserver \
minetest-runtime \
minetestserver \
user-luanti"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libgmp.so.10 \
libhiredis.so.1.3.0 \
libjsoncpp.so.27 \
libleveldb.so.1 \
libluajit-5.1.so.2 \
libm.so.6 \
libncursesw.so.6 \
libpq.so.5 \
libspatialindex.so.8 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtinfo.so.6 \
libz.so.1 \
libzstd.so.1 \
luanti-data \
shadow \
systemd"

inherit rpm

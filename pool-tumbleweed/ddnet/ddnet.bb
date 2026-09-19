SUMMARY = "DDraceNetwork, a cooperative racing mod of Teeworlds"
DESCRIPTION = "DDraceNetwork (DDNet) is an actively maintained version of DDRace, \
a Teeworlds modification with a unique cooperative gameplay. \
Help each other play through custom maps with up to 64 players, \
compete against the best in international tournaments, design your \
own maps, or run your own server."
LICENSE = "Apache-2.0 & CC-BY-SA-3.0 & Zlib & MIT & SUSE-Public-Domain"

PV = "20.0"

RPM_NAME = "ddnet-20.0-1.1.aarch64.rpm"
RPM_HASH = "67489910726328df6c9fa29b04670fb0a2e0d42053bead05471f0f3a44efad2ac1c60ad7abeda6da5a8b36730815734cc0245cf407fbed6cf96706503b1ab877"

RPROVIDES:${PN} += "ddnet \
libantibot.so"

RDEPENDS:${PN} += "ddnet-data \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLEW.so.2.3 \
libSDL2-2.0.so.0 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libm.so.6 \
libnotify.so.4 \
libopusfile.so.0 \
libpng16.so.16 \
libsqlite3.so.0 \
libstdc++.so.6 \
libvulkan.so.1 \
libwavpack.so.1 \
libz.so.1"

inherit rpm

SUMMARY = "Multiplayer server for Battle for Wesnoth"
DESCRIPTION = "This package contains the server program hosting multiplayer games of \
Battle for Wesnoth."
LICENSE = "EPL-1.0 & GPL-2.0-or-later"

PV = "1.18.8"

RPM_NAME = "wesnoth-server-1.18.8-1.1.aarch64.rpm"
RPM_HASH = "0b57814bec4572ae31a03b6f6d67d23438659f22f07a23004c1dd92fc93d8c5f462ab2709e9d69cf14a8b1c1c95e3841abb9c1c1312367062133ef9f6f65b3cf"

RPROVIDES:${PN} += "wesnoth-server"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-context.so.1.91.0 \
libboost-filesystem.so.1.91.0 \
libboost-iostreams.so.1.91.0 \
libboost-locale.so.1.91.0 \
libboost-random.so.1.91.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6 \
wesnoth-fslayout"

inherit rpm

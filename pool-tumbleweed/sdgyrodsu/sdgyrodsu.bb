SUMMARY = "DSU server for motion data running on Steam Deck"
DESCRIPTION = "This package provides the DSU (cemuhook protocol) \
server for motion data running on the Steam Deck."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "sdgyrodsu-2.1.1-1.5.aarch64.rpm"
RPM_HASH = "94061e2252316bb421bf51de83da0311c7d787e697c9e4402edf228c580afffd00b40e2f0c193ef451a731f13f8a51453f48cd8dd00528f74d0b300cee716c8a"

RPROVIDES:${PN} += "SteamDeckGyroDSU \
sdgyrodsu"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libhidapi-hidraw.so.0 \
libncurses.so.6 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm

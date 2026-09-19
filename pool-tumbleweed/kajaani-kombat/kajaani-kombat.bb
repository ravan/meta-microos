SUMMARY = "A remake of the classic arcade game Rampart"
DESCRIPTION = "A remake of the classis arcade game Rampart, with the change \
of the medieval world to a space-world. \
Playable on one machine but also over the net with 2-4 players (2 players \
may always use the same machine). \
 \
This package includes the client binary with built-in server."
LICENSE = "GPL-2.0-only"

PV = "0.7"

RPM_NAME = "kajaani-kombat-0.7-5.4.aarch64.rpm"
RPM_HASH = "812293754b5eec66a7944d3cf7f8c7ac59b30acdcfaacca7383f8da1e30f2f05910aa4187c99db6c9f9fac225011db4e3491d5ad3950342918f9c14ebd322cb4"

RPROVIDES:${PN} += "kajaani-kombat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libSDL-net-1.2.so.0 \
libSDL-ttf-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

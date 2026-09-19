SUMMARY = "Game engine for action RPGs"
DESCRIPTION = "Solarus is a 2D game engine written in C++, and it executes games \
made in Lua. It is designed with 16-bit classic action RPGs in \
mind. \
 \
This package contains the 'solarus-run' executable required to run \
games based on the Solarus engine."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.5"

RPM_NAME = "solarus-1.6.5-3.3.aarch64.rpm"
RPM_HASH = "2d5ad971a9078ec030e08062f9c65a4800cad081cfd8f4ea62c58dbfd8bf073f9e6fdddb441eb776c8ac57e196c44abd1ff9290f4d486b206d05a94c783ee7d7"

RPROVIDES:${PN} += "solarus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsolarus.so.1 \
libstdc++.so.6"

inherit rpm

SUMMARY = "A Bomberman clone"
DESCRIPTION = "This is an SDL2 version of the original 1999 version of Mr. Boom. \
The goal of the game is to bomb away enemies and other players."
LICENSE = "MIT"

PV = "5.5"

RPM_NAME = "mrboom-5.5-1.9.aarch64.rpm"
RPM_HASH = "d4726161093f6c5e3e8853d62e825076c0c3304455d1a1e4bb609d6ed3aa31f4f469058dba0871e83a6e8654a7f67dfebc06ced9e5d17428ee73219a90f31d40"

RPROVIDES:${PN} += "mrboom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libminizip.so.1 \
libstdc++.so.6"

inherit rpm

SUMMARY = "An opensource implementation of Wolfenstein3D engine"
DESCRIPTION = "ECWolf is a port of the Wolfenstein 3D engine based of Wolf4SDL."
LICENSE = "GPL-2.0-only"

PV = "1.4.2"

RPM_NAME = "ecwolf-1.4.2-1.5.aarch64.rpm"
RPM_HASH = "e0cb581b116c19ce177b403f68c94e157c38a4e96e9c807f19bf55bb628eb9b6733c866576c5a1c2e60702cb8b6311e5b35340a9d95a3d7adfecb3300ef1a3b0"

RPROVIDES:${PN} += "bundled-gdtoa \
bundled-lzma \
ecwolf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjpeg.so.8 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

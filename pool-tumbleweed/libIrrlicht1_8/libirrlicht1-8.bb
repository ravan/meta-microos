SUMMARY = "A high performance realtime 3D engine"
DESCRIPTION = "The Irrlicht Engine is a realtime 3D engine written and usable in C++ \
and also available for .NET languages. It is using Direct3D, OpenGL \
and its own software renderer, and has features which can be found in \
commercial 3D engines."
LICENSE = "Zlib"

PV = "1.8.5"

RPM_NAME = "libIrrlicht1_8-1.8.5-2.11.aarch64.rpm"
RPM_HASH = "6aeb96e56f3069861d663dbf900de8a083864a9dcc111b34e0d9e5bf800d7a9d6a5b01f0de4f616dca2cc19105fc17920a22953cff1934fc58bcb27ce9bbeb66"

RPROVIDES:${PN} += "libIrrlicht.so.1.8 \
libIrrlicht1-8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXxf86vm.so.1 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

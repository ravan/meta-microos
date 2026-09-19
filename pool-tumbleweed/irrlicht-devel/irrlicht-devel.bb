SUMMARY = "Development headers and libraries for irrlicht"
DESCRIPTION = "Development headers and libraries for irrlicht. \
 \
The Irrlicht Engine is a realtime 3D engine written and usable in C++ \
and also available for .NET languages. It is using Direct3D, OpenGL \
and its own software renderer, and has features which can be found in \
commercial 3D engines."
LICENSE = "Zlib"

PV = "1.8.5"

RPM_NAME = "irrlicht-devel-1.8.5-2.11.aarch64.rpm"
RPM_HASH = "5e76f70364796811c4d2cdadc6aa5ba8920dab1852977ee8849ea880c8d47baae47e5125e21adbeff35e0355bd789f6f7c92174948a3c0e42bee8c65e8a5810d"

RPROVIDES:${PN} += "irrlicht-devel"

RDEPENDS:${PN} += "libIrrlicht1-8 \
libstdc++-devel"

inherit rpm

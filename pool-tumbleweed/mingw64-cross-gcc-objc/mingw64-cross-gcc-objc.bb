SUMMARY = "MinGW Windows cross-compiler for Objective-C and Objective-C++"
DESCRIPTION = "MinGW Windows cross-compiler for Objective-C and Objective-C++"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw64-cross-gcc-objc-16.2.0-1.1.aarch64.rpm"
RPM_HASH = "43a7e9b3d1031d35110de4fb5f81cf17ec718b753473c42c308c587b63b32e31e5bfa752e42d9a90a4095bc4c5be99bb2ce96d99329ea4581487fd06707b9242"

RPROVIDES:${PN} += "mingw64-cross-gcc-objc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm

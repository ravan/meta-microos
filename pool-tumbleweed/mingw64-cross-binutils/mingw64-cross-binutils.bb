SUMMARY = "GNU Binutils"
DESCRIPTION = "The GNU Binutils are a collection of binary tools. \
These utilities (like 'as', 'ld', 'strip') understand Windows executables and DLLs."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.45.1"

RPM_NAME = "mingw64-cross-binutils-2.45.1-3.4.aarch64.rpm"
RPM_HASH = "4f4d99735d0d2871a4b8f41629aa13a2ed5c8fda8da7230c22e19fad57e345821f65b2c77d8e7d87b7b25e940cb46654c6e0cf0d332baaaf1e87cbb92fe5de0e"

RPROVIDES:${PN} += "libdep.so \
mingw64-cross-binutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfl.so.2 \
libm.so.6 \
mingw64-cross-binutils-utils \
mingw64-filesystem"

inherit rpm

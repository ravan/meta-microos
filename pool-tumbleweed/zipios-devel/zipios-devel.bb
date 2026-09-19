SUMMARY = "Zipios Header Files"
DESCRIPTION = "Header files for zipios development."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.2"

RPM_NAME = "zipios-devel-2.3.2-1.11.aarch64.rpm"
RPM_HASH = "b57ff093fcd9b1e8951f153856e6b0f04a6ff67478e78a8302bb7bba3b5e0b0e45408685afbd819e4f814feaa885f1455bc95a705a9ecd6cac8239bc73a7ba83"

RPROVIDES:${PN} += "cmake-ZipIos \
zipios-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1 \
libzipios.so.2 \
libzipios2 \
pkgconfig-zlib"

inherit rpm

SUMMARY = "Faust dynamic library"
DESCRIPTION = "Development files for embedding the Faust compiler in to your own application."
LICENSE = "GPL-2.0-only"

PV = "2.88.0"

RPM_NAME = "libfaust2-2.88.0-1.1.aarch64.rpm"
RPM_HASH = "9e72ee90b324d87d46f67d445d02151d16a6c878a7dd710309fc2376b55529f04b23124b5d4a45871d19be6eab335c00b5a7cfe2d9f3992f8556675e88ddddab"

RPROVIDES:${PN} += "libfaust.so.2 \
libfaust2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

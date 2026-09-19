SUMMARY = "Library to read/write PixInsight XISF files"
DESCRIPTION = "C++ library that can read and write XISF files produced by PixInsight."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.13+git5.7b70b6a"

RPM_NAME = "libXISF0-0.2.13+git5.7b70b6a-1.4.aarch64.rpm"
RPM_HASH = "1d1948f15b8cbc42e4b1a5cf3e4bf322071e585452653a4992391ab5734b39cba1e14f65ffc6bdc819748ce8eff32e1b25949d86db96bc2be71c91bc02fff65a"

RPROVIDES:${PN} += "libXISF.so.0 \
libXISF0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblz4.so.1 \
libpugixml.so.1 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm

SUMMARY = "Shared library for ImHex"
DESCRIPTION = "libimhex is a C++ library library providing functions needed for ImHex."
LICENSE = "GPL-2.0-only"

PV = "1.38.1"

RPM_NAME = "libimhex1_38_1-1.38.1-1.8.aarch64.rpm"
RPM_HASH = "c4d0ba9c96a5ebf7ebe1e1b472e99ccf4628024599108109d2793ce0a59171a69d52b053d1d82b0de9adc7530b230e10f88654c6aef5519513261121418d0af7"

RPROVIDES:${PN} += "libimhex.so.1.38.1 \
libimhex1-38-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libc.so.6 \
libcurl.so.4 \
libdbus-1.so.3 \
libfmt.so.10 \
libfreetype.so.6 \
libgcc-s.so.1 \
libglfw.so.3 \
libm.so.6 \
libmagic.so.1 \
libstdc++.so.6 \
libtfpsacrypto.so.2"

inherit rpm

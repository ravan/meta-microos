SUMMARY = "The Tiff Library (with JPEG and compression support)"
DESCRIPTION = "This package includes the tiff libraries. To link a program with \
libtiff, you will have to add -ljpeg and -lz to include the necessary \
libjpeg and libz in the linking process."
LICENSE = "HPND"

PV = "4.7.2"

RPM_NAME = "libtiff6-4.7.2-1.2.aarch64.rpm"
RPM_HASH = "5586fb4e53b8862d52814b1abdec6828dc7f68543f29b98f423f336a2d2a58a8249a6c493171394498a84ed2d4fa66185bba0fde19ec4b81aa22bc804c55362e"

RPROVIDES:${PN} += "libtiff \
libtiff.so.6 \
libtiff6 \
libtiffxx.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLerc.so.4 \
libc.so.6 \
libjbig.so.2 \
libjpeg.so.8 \
liblzma.so.5 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm

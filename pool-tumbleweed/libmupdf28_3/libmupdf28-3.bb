SUMMARY = "MuPDF rendering library (shared)"
DESCRIPTION = "MuPDF is a PDF and XPS viewer and parser/rendering library. \
 \
This package contains the shared rendering library."
LICENSE = "AGPL-3.0-or-later"

PV = "1.28.3"

RPM_NAME = "libmupdf28_3-1.28.3-1.1.aarch64.rpm"
RPM_HASH = "b22b324ce222098b6a982818df0a0f4b6a6d32351cfa380ae4dbe982605b424922c70aaf0875f8fc447d0d2635a6c7dd6b3ed9c861ab77a28017a59cb47ccd9a"

RPROVIDES:${PN} += "libmupdf.so.28.3 \
libmupdf28-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
libcmark-gfm-extensions.so.0.29.0.gfm.13 \
libcmark-gfm.so.0.29.0.gfm.13 \
libfreetype.so.6 \
libharfbuzz.so.0 \
libjbig2dec.so.0 \
libjpeg.so.8 \
libm.so.6 \
libopenjp2.so.7 \
libz.so.1"

inherit rpm

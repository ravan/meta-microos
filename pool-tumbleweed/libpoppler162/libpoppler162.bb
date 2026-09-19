SUMMARY = "PDF Rendering Library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "26.07.0"

RPM_NAME = "libpoppler162-26.07.0-1.2.aarch64.rpm"
RPM_HASH = "ccfe9bff0679ad29ee36bb19596e3bc883a06b0d4a898f2c7e5c86d509a7b1a796aec445b56ae0dbfd8412ec67852fd24ece5ff035afc1a866076d4afbf864a6"

RPROVIDES:${PN} += "libpoppler.so.162 \
libpoppler162"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgpgmepp.so.7 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libnspr4.so \
libnss3.so \
libopenjp2.so.7 \
libplc4.so \
libpng16.so.16 \
libsmime3.so \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1"

inherit rpm

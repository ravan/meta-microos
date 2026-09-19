SUMMARY = "Development files for the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "26.07.0"

RPM_NAME = "libpoppler-devel-26.07.0-1.2.aarch64.rpm"
RPM_HASH = "36e8d0f6f93e29c5c4b2c26c3c16be6f9a064a016bd1929c13dff4b478bd087dec9ad6f20ab35f6cf907dc202ad0a71dfe483f8ea263d583ebfb9544d33e6c77"

RPROVIDES:${PN} += "libpoppler-devel \
pkgconfig-poppler \
pkgconfig-poppler-cpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libboost-headers-devel \
libpoppler-cpp3 \
libpoppler162 \
libstdc++-devel \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-gpgmepp \
pkgconfig-lcms2 \
pkgconfig-libcurl \
pkgconfig-libjpeg \
pkgconfig-libopenjp2 \
pkgconfig-libpng \
pkgconfig-libtiff-4 \
pkgconfig-nss \
pkgconfig-zlib"

inherit rpm

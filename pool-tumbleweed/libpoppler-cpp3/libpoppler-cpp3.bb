SUMMARY = "C++ API of the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "26.07.0"

RPM_NAME = "libpoppler-cpp3-26.07.0-1.2.aarch64.rpm"
RPM_HASH = "dadc63ea7a1c004016d64f616df75d0a369e0575d9b7314849a34b2ecd34b3b678fcc4d549f89b8e0677ce36c09fb57b75a61de54f9f22449d9504adc2d60a5d"

RPROVIDES:${PN} += "libpoppler-cpp.so.3 \
libpoppler-cpp3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpoppler.so.162 \
libstdc++.so.6"

inherit rpm

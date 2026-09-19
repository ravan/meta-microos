SUMMARY = "Development files for the Poppler Qt6 wrapper library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "26.07.0"

RPM_NAME = "libpoppler-qt6-devel-26.07.0-1.2.aarch64.rpm"
RPM_HASH = "ad399424430a08096a78378e8dba543d900e31bb6d1ebbfdb9701249d6c47a2bb035e988f89013c14a1644db147c79418bff0f9ed7ba98134342819b8eb5af5d"

RPROVIDES:${PN} += "libpoppler-qt6-devel \
pkgconfig-poppler-qt6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Gui \
cmake-Qt6Widgets \
libpoppler-devel \
libpoppler-qt6-3 \
pkgconfig-freetype2 \
pkgconfig-poppler"

inherit rpm

SUMMARY = "Development files for the Poppler Qt5 wrapper library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "26.07.0"

RPM_NAME = "libpoppler-qt5-devel-26.07.0-1.2.aarch64.rpm"
RPM_HASH = "4e484c58a0f70ca980dc17ffdb72f92467347448449f97320c4f176203ea52ad62d0d1dc0d7836d59b3e21177d4e13c6849c8a1aae0519b8e5474d9ac15f0600"

RPROVIDES:${PN} += "libpoppler-qt5-devel \
pkgconfig-poppler-qt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpoppler-devel \
libpoppler-qt5-1 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Widgets \
pkgconfig-Qt5Xml \
pkgconfig-freetype2 \
pkgconfig-poppler"

inherit rpm

SUMMARY = "Qt5 wrapper for the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "26.07.0"

RPM_NAME = "libpoppler-qt5-1-26.07.0-1.2.aarch64.rpm"
RPM_HASH = "f333cbf09527bec1121eec7d804d52d1f784a763b7128350d86938a73dc2fc3f19f49ac41a0c4f36322c1f7a44a0df4c6c04efe13910e685230d7c8b5471c938"

RPROVIDES:${PN} += "libpoppler-qt5-1 \
libpoppler-qt5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libfreetype.so.6 \
liblcms2.so.2 \
libpoppler.so.162 \
libpoppler162 \
libstdc++.so.6"

inherit rpm

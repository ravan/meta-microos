SUMMARY = "Qt6 wrapper for the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "26.07.0"

RPM_NAME = "libpoppler-qt6-3-26.07.0-1.2.aarch64.rpm"
RPM_HASH = "7282a23b796f8b509f7484caf5173c0604cd402c184177575b96b9fdb6ffa1f48eb86ad32619fe6178f453f72d15f7ca25b18055bc7db9f0aacd18ba612612df"

RPROVIDES:${PN} += "libpoppler-qt6-3 \
libpoppler-qt6.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libfreetype.so.6 \
liblcms2.so.2 \
libpoppler.so.162 \
libpoppler162 \
libstdc++.so.6"

inherit rpm

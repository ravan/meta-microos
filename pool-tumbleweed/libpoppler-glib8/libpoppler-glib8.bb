SUMMARY = "Glib wrapper for the poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "26.07.0"

RPM_NAME = "libpoppler-glib8-26.07.0-1.2.aarch64.rpm"
RPM_HASH = "b7f81b15a1becc4bf7851480d59d640c8ffb460a08c7dd21ae482b74e5a13d2b030d1f5c6d1b340dd4ffcaaec1935e5221dc7b8687106c064385078faf65e939"

RPROVIDES:${PN} += "libpoppler-glib.so.8 \
libpoppler-glib8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpoppler.so.162 \
libpoppler162 \
libstdc++.so.6"

inherit rpm

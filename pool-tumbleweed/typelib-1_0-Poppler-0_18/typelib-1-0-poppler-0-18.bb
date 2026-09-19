SUMMARY = "Introspection bindings for the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC. \
 \
This package provides the GObject Introspection bindings for Poppler."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "26.07.0"

RPM_NAME = "typelib-1_0-Poppler-0_18-26.07.0-1.2.aarch64.rpm"
RPM_HASH = "a97748e3ad52eaf03f8ab47a67bf788c3caf0130c7b5354b968425044612c7033280eaf72bf97ea856e673d74341b6d1524256f656aa6da45b5817314fa9e0f0"

RPROVIDES:${PN} += "typelib-1-0-Poppler-0-18 \
typelib-Poppler"

RDEPENDS:${PN} += "libpoppler-glib.so.8 \
libpoppler.so.162 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-cairo"

inherit rpm

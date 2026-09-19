SUMMARY = "Ayatana application indicators library"
DESCRIPTION = "This package contains the GObject Introspection bindings for the \
ayatana appindicator library."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "0.5.93"

RPM_NAME = "typelib-1_0-AyatanaAppIndicator3-0_1-0.5.93-3.4.aarch64.rpm"
RPM_HASH = "55c19a102b83fdddaccc2f4416c1b31b485258541983ba3eaae5e4c96045077974a02ebf725d8f50a5ab0e49182ff9dee59d90950af66f1a913c524f3297ac8b"

RPROVIDES:${PN} += "typelib-1-0-AyatanaAppIndicator3-0-1 \
typelib-AyatanaAppIndicator3"

RDEPENDS:${PN} += "libayatana-appindicator3.so.1 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm

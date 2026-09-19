SUMMARY = "Introspection bindings for the GNOME Desktop API library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons. \
 \
This package provides the GObject Introspection bindings for \
libgnome-desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "44.5"

RPM_NAME = "typelib-1_0-GnomeRR-4_0-44.5-1.5.aarch64.rpm"
RPM_HASH = "15b0d041b6961a2b10f1cd9f5d5948671b9f8a25c165966948cf469e2e92d9c153cdbae696c584698992ca32253d4b7a0ec25beb8f5641b9068d2914cc9f9373"

RPROVIDES:${PN} += "typelib-1-0-GnomeRR-4-0 \
typelib-GnomeRR"

RDEPENDS:${PN} += "libgnome-rr-4.so.2 \
typelib-GDesktopEnums \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-GnomeDesktop \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm

SUMMARY = "Introspection bindings for libcheese"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects. \
 \
This package provides the GObject Introspection bindings for the \
libcheese library."
LICENSE = "GPL-2.0-or-later"

PV = "44.1+12"

RPM_NAME = "typelib-1_0-Cheese-3_0-44.1+12-1.6.aarch64.rpm"
RPM_HASH = "a4f49850569e2002e9b146d80c82371cf63b62fd101284ff9616e0c46ccde387b0e8e818fb7e16102462490c74d7ceb53ef84986db8b091eb2c7aa8da467c52f"

RPROVIDES:${PN} += "typelib-1-0-Cheese-3-0 \
typelib-Cheese"

RDEPENDS:${PN} += "libcheese.so.8 \
typelib-Atk \
typelib-Clutter \
typelib-Cogl \
typelib-CoglPango \
typelib-GL \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gst \
typelib-HarfBuzz \
typelib-Json \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm

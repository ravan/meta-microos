SUMMARY = "Typelib for libadapta"
DESCRIPTION = "Typelib for libadapta."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.0"

RPM_NAME = "typelib-1_0-Adap-1-1.5.0-2.4.aarch64.rpm"
RPM_HASH = "33a431fde62eb61c20fc3a1efa0398884cd7d40e7efb0da40ae57483532ac789f4210b786964d635fce230397e86ccca2c735bd582dc0535c4ebfa8d71480c71"

RPROVIDES:${PN} += "typelib-1-0-Adap-1 \
typelib-Adap"

RDEPENDS:${PN} += "libadapta-1.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm

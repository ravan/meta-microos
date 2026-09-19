SUMMARY = "Introspection file for libshumate"
DESCRIPTION = "C library providing a GtkWidget to display maps. \
This package contains introspection file for libshumate."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause & CC0-1.0 & CC-BY-3.0 & GFDL-1.2-only"

PV = "1.6.3"

RPM_NAME = "typelib-1_0-Shumate-1_0-1.6.3-1.1.aarch64.rpm"
RPM_HASH = "fa0ec3371b5ba9c395bcbdf9cd7738c4100c3281a1e512502b2177df6ddf6f74241a1f4b5ffdc87824d082953a948480f9966ab35e63be6aa33847c34ed57850"

RPROVIDES:${PN} += "typelib-1-0-Shumate-1-0 \
typelib-Shumate"

RDEPENDS:${PN} += "libshumate-1.0.so.1 \
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

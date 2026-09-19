SUMMARY = "Typelib for pantheon-wayland"
DESCRIPTION = "Typelib for pantheon-wayland."
LICENSE = "LGPL-3.0-or-later"

PV = "1.1.0"

RPM_NAME = "typelib-1_0-PantheonWayland-1_0-1.1.0-1.5.aarch64.rpm"
RPM_HASH = "f5d7222a7c83dd5c394ab0f61d7dd078e6a23041c74b248dfd373a7a53b3ca060783dcd4881bcf6f3874140dd3c44817c7451b7c4b644b20bea49f834a63ce0c"

RPROVIDES:${PN} += "typelib-1-0-PantheonWayland-1-0 \
typelib-PantheonWayland"

RDEPENDS:${PN} += "libpantheon-wayland.so.1 \
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

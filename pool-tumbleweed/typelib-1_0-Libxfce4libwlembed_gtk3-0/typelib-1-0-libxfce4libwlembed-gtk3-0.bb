SUMMARY = "Introspection bindings for libwlembed-gtk3"
DESCRIPTION = "This package provides the GObject Introspection bindings for libwlembed-gtk3."
LICENSE = "GPL-3.0-only"

PV = "0.0.0"

RPM_NAME = "typelib-1_0-Libxfce4libwlembed_gtk3-0-0.0.0-1.7.aarch64.rpm"
RPM_HASH = "6bf49dd4a93b6407667016e527233f4b5501263d20f14bd3eabd4fe1bf23d00b680c451deceff3b6ecab181d01b0078b417a548ab50a281a52d650908d51e937"

RPROVIDES:${PN} += "typelib-1-0-Libxfce4libwlembed-gtk3-0 \
typelib-Libxfce4libwlembed-gtk3"

RDEPENDS:${PN} += "libwlembed-gtk3-0.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Libwlembed \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm

SUMMARY = "GObject Introspection interface description for Libxfce4windowing"
DESCRIPTION = "GObject Introspection interface description for Libxfce4windowing."
LICENSE = "LGPL-2.1-or-later"

PV = "4.20.7"

RPM_NAME = "typelib-1_0-Libxfce4windowing-0_0-4.20.7-1.1.aarch64.rpm"
RPM_HASH = "7b98c5513f88a362fcb3dea444c91cb207b355ea751b97a8228044859aa99108609e0867536c8aad33fd665cdc44beddb4f253af3f8dd095d08bae1f3789401b"

RPROVIDES:${PN} += "typelib-1-0-Libxfce4windowing-0-0 \
typelib-Libxfce4windowing"

RDEPENDS:${PN} += "libxfce4windowing-0.so.0 \
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

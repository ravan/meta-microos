SUMMARY = "Introspections files for libportal"
DESCRIPTION = "A GIO-style async API for most Flatpak portals. \
This package contains the introspection files of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "typelib-1_0-XdpGtk4-1_0-0.10.0-1.2.aarch64.rpm"
RPM_HASH = "5aaa7f4d773ca151598a4538de5de2757fd5206491e0aa9924db71b33adf0d639c64f7054279b9513278b051c0710fe9e76632df10559801540a9778f8d67843"

RPROVIDES:${PN} += "typelib-1-0-XdpGtk4-1-0 \
typelib-XdpGtk4"

RDEPENDS:${PN} += "libportal-gtk4.so.1 \
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
typelib-Xdp \
typelib-cairo \
typelib-freetype2"

inherit rpm

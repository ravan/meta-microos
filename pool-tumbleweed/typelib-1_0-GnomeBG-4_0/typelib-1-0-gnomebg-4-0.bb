SUMMARY = "Introspection bindings for the GNOME Desktop API library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons. \
 \
This package provides the GObject Introspection bindings for \
libgnome-desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "44.5"

RPM_NAME = "typelib-1_0-GnomeBG-4_0-44.5-1.5.aarch64.rpm"
RPM_HASH = "29deb9f1a736965cfec01ccb4c73f7bc5f02f2c8bb0ee9cf98a5d19bbb3d05ba3b5b01f963e339b693bdeaaa4881b2a60206e8704c87f03a01b573ee7a9f7cbc"

RPROVIDES:${PN} += "typelib-1-0-GnomeBG-4-0 \
typelib-GnomeBG"

RDEPENDS:${PN} += "libgnome-bg-4.so.2 \
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

SUMMARY = "UI Library for the Xfce Desktop Environment"
DESCRIPTION = "The libxfce4ui library provides a number of widgets commonly used by Xfce \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "4.20.2"

RPM_NAME = "typelib-1_0-Libxfce4ui-2_0-4.20.2-1.5.aarch64.rpm"
RPM_HASH = "d64b2859c21900ffbce43c3353ad092da1a8a7e35fe78e86e1730e3e41c0b9ad58c87b62480dc8d5df437f19b867919a2051508060ed114d073384f471f2db7b"

RPROVIDES:${PN} += "typelib-1-0-Libxfce4ui-2-0 \
typelib-1-0-libxfce4ui-2-0 \
typelib-Libxfce4ui"

RDEPENDS:${PN} += "libxfce4ui-2.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Libxfce4util \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm

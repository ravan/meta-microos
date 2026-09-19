SUMMARY = "GObject Introspection interface description for Libxfce4windowingui"
DESCRIPTION = "GObject Introspection interface description for Libxfce4windowingui."
LICENSE = "LGPL-2.1-or-later"

PV = "4.20.7"

RPM_NAME = "typelib-1_0-Libxfce4windowingui-0_0-4.20.7-1.1.aarch64.rpm"
RPM_HASH = "2a1b30c066e38dea683976fd17d8b87a9ae3a3020cf57351bd0e0e09f7fd0e879bdc34ab845e90024874e2d86bab8fce540e470d27164443bf7c246b24ef1873"

RPROVIDES:${PN} += "typelib-1-0-Libxfce4windowingui-0-0 \
typelib-Libxfce4windowingui"

RDEPENDS:${PN} += "libxfce4windowingui-0.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Libxfce4windowing \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm

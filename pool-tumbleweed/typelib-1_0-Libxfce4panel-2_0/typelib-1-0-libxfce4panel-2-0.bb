SUMMARY = "Xfce Panel Shared Library"
DESCRIPTION = "GObject introspection bindings for Xfce Panel"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.20.8"

RPM_NAME = "typelib-1_0-Libxfce4panel-2_0-4.20.8-1.1.aarch64.rpm"
RPM_HASH = "728677e64079c9c17db994591f048856964321e24cfbe7c60c5a4e520d18c6f5db3891fa473e38c165246e02aa495003cdc9f900879ca0c6fa9d00c613309a6d"

RPROVIDES:${PN} += "typelib-1-0-Libxfce4panel-2-0 \
typelib-Libxfce4panel"

RDEPENDS:${PN} += "libxfce4panel-2.0.so.4 \
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

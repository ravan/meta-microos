SUMMARY = "A remote desktop client for GNOME"
DESCRIPTION = "A remote desktop client for the GNOME desktop environment."
LICENSE = "GPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-connections-50.0-1.3.aarch64.rpm"
RPM_HASH = "18f4ffe23fa4645967beddd1ef4f22c29da19639966c6606bc6d70a1428a639f41383522d1277821caa6356f935ecad2ec6861e14d6a2b59821b8f26253bf715"

RPROVIDES:${PN} += "gnome-connections \
libgtk-frdp-0.2.so \
typelib-GtkFrdp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfreerdp-client3.so.3 \
libfreerdp3.so.3 \
libfuse3.so.4 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-vnc-2.0.so.0 \
libgvnc-1.0.so.0 \
libgvncpulse-1.0.so.0 \
libhandy-1.so.0 \
libsecret-1.so.0 \
libspice-client-glib-2.0.so.8 \
libspice-client-gtk-3.0.so.5 \
libwinpr3.so.3 \
libxml2.so.16 \
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

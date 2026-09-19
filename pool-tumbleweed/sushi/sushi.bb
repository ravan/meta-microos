SUMMARY = "Quick Previewer for Nautilus"
DESCRIPTION = "Sushi is a quick previewer for Nautilus, the GNOME desktop file manager."
LICENSE = "SUSE-GPL-2.0-with-plugin-exception"

PV = "50.0"

RPM_NAME = "sushi-50.0-1.3.aarch64.rpm"
RPM_HASH = "5a15f59dbf7ae219b0474a9d69a8c2bdf2731e0c18a5ef306cf0ed60453d10b2414d557f7df22882279a172703284dd9c9a34f758ee6b910c9f9a781edf7a929"

RPROVIDES:${PN} += "libsushi-1.0.so \
sushi \
typelib-Sushi"

RDEPENDS:${PN} += "/usr/bin/gjs \
evince-plugin-pdfdocument \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libepoxy.so.0 \
libevdocument3.so.4 \
libfreetype.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libharfbuzz.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
typelib-Atk \
typelib-EvinceDocument \
typelib-EvinceView \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gst \
typelib-GstBase \
typelib-GstTag \
typelib-Gtk \
typelib-GtkSource \
typelib-HarfBuzz \
typelib-Pango \
typelib-Soup \
typelib-WebKit2 \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm

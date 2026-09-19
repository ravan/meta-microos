SUMMARY = "Movie Player for the GNOME Desktop"
DESCRIPTION = "Totem is a movie player for the GNOME desktop based on GStreamer. It \
features a playlist, a full-screen mode, seek and volume controls, and \
complete keyboard navigation."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "43.2+git402.b8d8108e0"

RPM_NAME = "totem-43.2+git402.b8d8108e0-2.3.aarch64.rpm"
RPM_HASH = "d5287d46c783a8c650d3743558db4ac17988a1fcd6111ee1e740bc6e19f98271ed0594d696a81f7a8116bb9c5d782413fd6d10629bee82f51c7b82fd1ffaf415"

RPROVIDES:${PN} += "libtotem.so.0 \
totem \
typelib-Totem"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
gstreamer-plugins-good \
gstreamer-plugins-good-gtk \
iso-codes \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnome-desktop-3.so.20 \
libgobject-2.0.so.0 \
libgrilo-0.3.so.0 \
libgrlpls-0.3.so.0 \
libgstaudio-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpeas-2.so.0 \
libtotem-plparser.so.18 \
totem-video-thumbnailer \
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
typelib-TotemPlParser \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm

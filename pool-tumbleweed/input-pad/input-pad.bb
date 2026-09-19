SUMMARY = "On-screen Input Pad to Send Characters with Mouse"
DESCRIPTION = "The input pad is a tool to send a character on button to text applications."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.99.20210817"

RPM_NAME = "input-pad-1.0.99.20210817-1.8.aarch64.rpm"
RPM_HASH = "a0a6b780e76c071e5d68e6f3739d7c527d1ed9ff582a29a2f7603b83990e3b806cd42e3ef60b2bb695849dd4e0c7c3045883495f51e59cfc751444534c5d26c4"

RPROVIDES:${PN} += "input-pad \
libinput-pad-1.0.so.1 \
typelib-InputPad"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxkbfile.so.1 \
libxklavier.so.16 \
libxml2.so.16 \
python3-gobject \
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

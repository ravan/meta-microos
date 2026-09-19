SUMMARY = "Gtk client and libraries for SPICE remote desktop servers - gi-bindings"
DESCRIPTION = "A Gtk client and libraries for SPICE remote desktop servers, (Linux and Windows)"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.43"

RPM_NAME = "typelib-1_0-SpiceClientGtk-3_0-0.43-1.1.aarch64.rpm"
RPM_HASH = "53ba78c20b5c298728011b7d8f02b6f8adbf57f61a4241447183d56c9497b80afc524e6979dadd24d7028c7cf3556ac8174d95507de6f441058e9c4c1ea9799e"

RPROVIDES:${PN} += "typelib-1-0-SpiceClientGtk-3-0 \
typelib-SpiceClientGtk"

RDEPENDS:${PN} += "libspice-client-gtk-3.0.so.5 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gst \
typelib-GstBase \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-SpiceClientGLib \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm

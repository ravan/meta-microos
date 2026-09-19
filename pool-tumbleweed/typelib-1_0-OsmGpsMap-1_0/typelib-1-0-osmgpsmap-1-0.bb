SUMMARY = "A Gtk+ Widget for Displaying OpenStreetMap tiles"
DESCRIPTION = "A Gtk+ widget (and Python bindings) that when given GPS co-ordinates, draws a GPS track, \
and points of interest on a moving map display. Downloads map data from a number of websites, \
including openstreetmap.org. \
 \
The library has excellent performance and is currently used in a number of \
Gtk+ and Maemo applications."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "typelib-1_0-OsmGpsMap-1_0-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "f599ff97f24c2dcf82496401f125c10dd657c5bef1cb30290ddbe24c942b9c312a6a4a5ae842385569fe322874bbc34930beedeed3da008f1276e70f506cb08b"

RPROVIDES:${PN} += "typelib-1-0-OsmGpsMap-1-0 \
typelib-OsmGpsMap"

RDEPENDS:${PN} += "libosmgpsmap-1.0.so.1 \
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

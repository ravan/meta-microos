SUMMARY = "A Gtk+ Widget for Displaying OpenStreetMap tiles"
DESCRIPTION = "A Gtk+ widget (and Python bindings) that when given GPS co-ordinates, draws a GPS track, \
and points of interest on a moving map display. Downloads map data from a number of websites, \
including openstreetmap.org. \
 \
The library has excellent performance and is currently used in a number of \
Gtk+ and Maemo applications."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "libosmgpsmap-1_0-1-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "0b735cbdaceb5bbff20545bb530852d9fb821d51b6441f2548527d6d59ccfd7ae8dc1eeb756fa7b173a1ef9dcf5bb4bd996e461c35c57bef485abf6b1aa1af3d"

RPROVIDES:${PN} += "libosmgpsmap-1-0-1 \
libosmgpsmap-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libsoup-3.0.so.0"

inherit rpm

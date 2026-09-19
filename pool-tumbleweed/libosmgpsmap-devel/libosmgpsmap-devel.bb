SUMMARY = "A Gtk+ Widget for Displaying OpenStreetMap tiles - Development files"
DESCRIPTION = "A Gtk+ widget (and Python bindings) that when given GPS co-ordinates, draws a GPS track, \
and points of interest on a moving map display. Downloads map data from a number of websites, \
including openstreetmap.org. \
 \
The library has excellent performance and is currently used in a number of \
Gtk+ and Maemo applications."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "libosmgpsmap-devel-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "5f57a36b0db99154a3a0db629441196fce648b934fd68faab63c62b622841908a6fd8c00b905d3b3f994c84512c0d8550b94baf3504b06964f08835b5476cdfd"

RPROVIDES:${PN} += "libosmgpsmap-devel \
pkgconfig-osmgpsmap-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmgpsmap-1-0-1 \
pkgconfig-gtk+-3.0 \
pkgconfig-libsoup-3.0 \
typelib-1-0-OsmGpsMap-1-0"

inherit rpm

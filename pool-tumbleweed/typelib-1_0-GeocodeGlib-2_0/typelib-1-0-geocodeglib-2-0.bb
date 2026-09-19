SUMMARY = "Introspection bindings for geocode-glib"
DESCRIPTION = "The geocode-glib library is a convenience library for the Yahoo! Place \
Finder APIs, as described at http://developer.yahoo.com/geo/placefinder/ \
 \
The Place Finder web service allows to do geocoding (finding longitude \
and latitude from an address), and reverse geocoding (finding an address \
from coordinates). \
 \
This package provides the GObject Introspection bindings for the \
geocode-glib library."
LICENSE = "LGPL-2.0-or-later"

PV = "3.26.4"

RPM_NAME = "typelib-1_0-GeocodeGlib-2_0-3.26.4-3.1.aarch64.rpm"
RPM_HASH = "f0b291e740ad34efda7be87788f09c8978b570ef43e0f21dd19689979b54babdde2f1dbf528eea1d3d368dd1a28d52089d3eb8628f8cfe40e00d43b855e8a15c"

RPROVIDES:${PN} += "typelib-1-0-GeocodeGlib-2-0 \
typelib-GeocodeGlib"

RDEPENDS:${PN} += "libgeocode-glib-2.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Json \
typelib-Soup"

inherit rpm

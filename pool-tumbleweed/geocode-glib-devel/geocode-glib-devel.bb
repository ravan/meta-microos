SUMMARY = "Development files for geocode-glib, a library for the Yahoo Place Finder APIs"
DESCRIPTION = "The geocode-glib library is a convenience library for the Yahoo! Place \
Finder APIs, as described at http://developer.yahoo.com/geo/placefinder/ \
 \
The Place Finder web service allows to do geocoding (finding longitude \
and latitude from an address), and reverse geocoding (finding an address \
from coordinates). \
 \
This package contains development files needed to develop with the \
geocode-glib library."
LICENSE = "LGPL-2.0-or-later"

PV = "3.26.4"

RPM_NAME = "geocode-glib-devel-3.26.4-3.1.aarch64.rpm"
RPM_HASH = "5acc33dc72b94da32e0f987e33259aa0bb1e8ccf5c10457054fcc4f68581734793fcc236cb071d33695e3b3c505bf83ddbe1713b2a92170cbcb1707ecfd0fce3"

RPROVIDES:${PN} += "geocode-glib-devel \
pkgconfig-geocode-glib-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgeocode-glib-2-0 \
pkgconfig-gio-2.0 \
typelib-1-0-GeocodeGlib-2-0"

inherit rpm

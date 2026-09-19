SUMMARY = "Convenience library for the Yahoo! Place Finder APIs"
DESCRIPTION = "The geocode-glib library is a convenience library for the Yahoo! Place \
Finder APIs, as described at http://developer.yahoo.com/geo/placefinder/ \
 \
The Place Finder web service allows to do geocoding (finding longitude \
and latitude from an address), and reverse geocoding (finding an address \
from coordinates)."
LICENSE = "LGPL-2.0-or-later"

PV = "3.26.4"

RPM_NAME = "geocode-glib-3.26.4-3.1.aarch64.rpm"
RPM_HASH = "b6a6fbb977b7aff7436792bfb69c8fb140b5345a6d7376286b24fc24c4d62865abc3841553c757a1b19d0a1c669eb49acc272656c7391fa3f036e90c2d49dec4"

RPROVIDES:${PN} += "geocode-glib"

RDEPENDS:${PN} += ""

inherit rpm

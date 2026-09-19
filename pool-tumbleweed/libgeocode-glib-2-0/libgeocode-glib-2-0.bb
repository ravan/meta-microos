SUMMARY = "Convenience library for the Yahoo! Place Finder APIs"
DESCRIPTION = "The geocode-glib library is a convenience library for the Yahoo! Place \
Finder APIs, as described at http://developer.yahoo.com/geo/placefinder/ \
 \
The Place Finder web service allows to do geocoding (finding longitude \
and latitude from an address), and reverse geocoding (finding an address \
from coordinates)."
LICENSE = "LGPL-2.0-or-later"

PV = "3.26.4"

RPM_NAME = "libgeocode-glib-2-0-3.26.4-3.1.aarch64.rpm"
RPM_HASH = "6b7a7d28067232f420f5e8f075baaba48eb842f0f82002ef488df72335c011602e2a534e4a5172d3b25a9bec9c98dd6593fec21adaabea9cfb112f6d9aff3168"

RPROVIDES:${PN} += "libgeocode-glib-2-0 \
libgeocode-glib-2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
geocode-glib \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libsoup-3.0.so.0"

inherit rpm

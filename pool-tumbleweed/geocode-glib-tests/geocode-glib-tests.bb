SUMMARY = "Installed tests for geocode-glib"
DESCRIPTION = "Installed tests for geocode-glib. Provides test binaries for \
geo-uri parsing, geocoding, and mock backend validation."
LICENSE = "LGPL-2.0-or-later"

PV = "3.26.4"

RPM_NAME = "geocode-glib-tests-3.26.4-3.1.aarch64.rpm"
RPM_HASH = "33f03aaaab31d2ddac42c6015215233bb001d82a465e8337505ab9ec58540032bbd5222478c4c1671dbc0032f8369c63ce0d428c5f629342c9f1493ad31a28ed"

RPROVIDES:${PN} += "geocode-glib-tests"

RDEPENDS:${PN} += "gnome-desktop-testing \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgeocode-glib-2-0 \
libgeocode-glib-2.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsoup-3.0.so.0"

inherit rpm

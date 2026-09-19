SUMMARY = "ATK/D-Bus bridging library"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus. \
 \
The package contains a ATK/D-Bus bridge library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.60.6"

RPM_NAME = "libatk-bridge-2_0-0-2.60.6-1.1.aarch64.rpm"
RPM_HASH = "b577a8b76ea9c984fe93936911d7485bc58f03cd86163fdf6719a47b6d3eb15eb60f62d609173d4bb25886d996fcae9ca1b5517f797ad641ab3898a5a28e7c74"

RPROVIDES:${PN} += "libatk-bridge-2-0-0 \
libatk-bridge-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libatspi.so.0 \
libc.so.6 \
libdbus-1.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm

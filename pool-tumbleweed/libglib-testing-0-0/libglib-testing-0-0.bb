SUMMARY = "GLib test harness and mocking framework"
DESCRIPTION = "libglib-testing is a test library providing test harnesses and mock \
classes which complement the classes provided by GLib. It is \
intended to be used by any project which uses GLib and which wants \
to write internal unit tests."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.0"

RPM_NAME = "libglib-testing-0-0-0.2.0-1.1.aarch64.rpm"
RPM_HASH = "2d9cab72bce5fe72d394db612c29914b2f5139d213ead00fdba8c2e2d52b6ef992c90a01811a3ef0c0700ba9de05cd87df882c0b09f934d892d20dc8ffc508ec"

RPROVIDES:${PN} += "libglib-testing-0-0 \
libglib-testing-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm

SUMMARY = "GLib test harness and mocking framework"
DESCRIPTION = "libglib-testing is a test library providing test harnesses and mock \
classes which complement the classes provided by GLib. It is \
intended to be used by any project which uses GLib and which wants \
to write internal unit tests."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.0"

RPM_NAME = "libglib-testing-devel-0.2.0-1.1.aarch64.rpm"
RPM_HASH = "0a53ccb7182eeef11290ce3481b3cbb91d7e03fe192766be5f1c439f63d1efd51fec3ac46cc1a0cecf61651afce7aa941d833a159655f7cd5f262a8515779922"

RPROVIDES:${PN} += "libglib-testing-devel \
pkgconfig-glib-testing-0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libglib-testing-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm

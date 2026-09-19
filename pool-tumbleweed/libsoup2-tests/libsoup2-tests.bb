SUMMARY = "Installed tests for libsoup2"
DESCRIPTION = "Installed tests for libsoup2 (libsoup 2.4), compatible with gnome-desktop-testing-runner. \
Tests cover HTTP client/server, GNOME authentication, and TLS. \
Run with: gnome-desktop-testing-runner libsoup-2.4"
LICENSE = "LGPL-2.1-or-later"

PV = "2.74.3"

RPM_NAME = "libsoup2-tests-2.74.3-22.1.aarch64.rpm"
RPM_HASH = "e5b1c658bb11dd49b1e6509f43284ba77056ba99c262fdc9b32f56c84029bb5bb89069e26eec71d52b639a509765ae975d2c0ab3e084bade0b29a0965df9a2da"

RPROVIDES:${PN} += "libsoup2-tests \
libtest-utils.so"

RDEPENDS:${PN} += "gnome-desktop-testing \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsoup-2-4-1 \
libsoup-2.4.so.1 \
libz.so.1"

inherit rpm

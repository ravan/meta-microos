SUMMARY = "Installed tests for libfprint-2"
DESCRIPTION = "Installed tests for libfprint, compatible with gnome-desktop-testing-runner. \
Tests use a virtual USB fingerprint device driver — no hardware required. \
Run with: gnome-desktop-testing-runner libfprint-2"
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.10+tod1"

RPM_NAME = "libfprint-tests-1.94.10+tod1-3.1.aarch64.rpm"
RPM_HASH = "812f7c87de0002e693981c596e216b5dce1256c2be73583f2a849cb66f89f3349f1561d21473987cb91fbf64fc180afb3a6f234454db83cd1b2dda13d5bdc97f"

RPROVIDES:${PN} += "libdevice-fake-tod-driver.so \
libfprint-tests"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
gnome-desktop-testing \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfprint-2-tod.so.1 \
libfprint-2-tod1 \
libfprint-2.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
typelib-FPrint \
typelib-GLib"

inherit rpm

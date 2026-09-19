SUMMARY = "Installed tests for glib-networking"
DESCRIPTION = "Installed tests for glib-networking, compatible with gnome-desktop-testing-runner. \
Tests cover TLS/HTTPS connections, proxy support, and GnuTLS integration. \
Run with: gnome-desktop-testing-runner glib-networking"
LICENSE = "LGPL-2.1-or-later"

PV = "2.80.1"

RPM_NAME = "glib-networking-tests-2.80.1-4.1.aarch64.rpm"
RPM_HASH = "87daf63ecd6c7634cc477d55f1f7faf3689a5ee0723746cc158e2bd6fe592698c46fc826069d5b7c0f54ea25291ff3f6d872dcc18d9c25de148ef8993ea4cff8"

RPROVIDES:${PN} += "glib-networking-tests"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
dbus-1 \
glib-networking \
gnome-desktop-testing \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0"

inherit rpm

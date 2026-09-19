SUMMARY = "Installed tests for libjcat"
DESCRIPTION = "This package provides installed tests for libjcat, \
compatible with gnome-desktop-testing-runner."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.6"

RPM_NAME = "libjcat-tests-0.2.6-2.1.aarch64.rpm"
RPM_HASH = "8297fc90fb8a334b23a5c556dcdf056d2e4cc2d4eeac170cc5d6fb95b358d95c2e20d387638532a3d2bb1f2b42266aa886acf7fb6d04c45e4d57c58e29f2c3ce"

RPROVIDES:${PN} += "libjcat-tests"

RDEPENDS:${PN} += "gnome-desktop-testing \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgpg-error.so.0 \
libgpgme.so.45 \
libjcat1 \
libjson-glib-1.0.so.0"

inherit rpm

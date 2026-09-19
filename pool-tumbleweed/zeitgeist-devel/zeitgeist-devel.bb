SUMMARY = "Development files for Zeitgeist client library"
DESCRIPTION = "Libzeitgeist is a client library for interacting with the Zeitgeist \
daemon. \
 \
This package provides the necessary files for development with Zeitgeist."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.0.4"

RPM_NAME = "zeitgeist-devel-1.0.4-1.9.aarch64.rpm"
RPM_HASH = "23e2d6b83b8d755bb67b3de7634e1d80f07f5bd583b9cec410487730fc3b6d7aa6d5337c712398a662df1958b64fdc20d1c51522b8e06ed07ae277dccc2d7dc4"

RPROVIDES:${PN} += "pkgconfig-zeitgeist-2.0 \
zeitgeist-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzeitgeist-2-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-Zeitgeist-2-0"

inherit rpm

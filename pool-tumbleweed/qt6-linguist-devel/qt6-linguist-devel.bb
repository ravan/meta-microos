SUMMARY = "Qt 6 linguist tools - Development files"
DESCRIPTION = "Development files for the Qt 6 linguist tools."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-linguist-devel-6.11.2-2.3.aarch64.rpm"
RPM_HASH = "c760468ca49083f8010c5ba511e1ab24b521fdec25c84479e9eed0589c7832e7470dd8da15cdbdfb80b208872e3cdef8be009d60f3c4179311dc3bacfb9f6b0f"

RPROVIDES:${PN} += "cmake-Qt6Linguist \
cmake-Qt6LinguistTools \
pkgconfig-Qt6Linguist \
qt6-linguist-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
qt6-tools-linguist"

inherit rpm

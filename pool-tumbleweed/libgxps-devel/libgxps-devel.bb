SUMMARY = "Development files for libgxps, a XPS document render library"
DESCRIPTION = "libgxps is a GObject based library for handling and rendering XPS \
documents."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.2+5"

RPM_NAME = "libgxps-devel-0.3.2+5-1.13.aarch64.rpm"
RPM_HASH = "b395f36b6b08a72ff6c8b7aaa2f3f5a8f9d158dd14700b9639fdc1bddba0027dcba05e8080da245709a395892d90da6853c08e8fbd8302c745ed6e0f331aba13"

RPROVIDES:${PN} += "libgxps-devel \
pkgconfig-libgxps"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgxps2 \
pkgconfig-cairo \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libarchive \
typelib-1-0-GXPS-0-1"

inherit rpm

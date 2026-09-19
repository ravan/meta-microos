SUMMARY = "Development files for libaccounts-glib"
DESCRIPTION = "This package contains the development files for the accounts-glib \
library."
LICENSE = "LGPL-2.1-only"

PV = "1.27"

RPM_NAME = "libaccounts-glib-devel-1.27-1.10.aarch64.rpm"
RPM_HASH = "9109079d8ad1c8a585b6fe123d5ebb9ce799ef72ab6db372d86f9293feea30d5f134e4cb298f54122e5eec77580bd55cb384b6bfce22bdcb3643a7d2bb2c8b3a"

RPROVIDES:${PN} += "libaccounts-glib-devel \
pkgconfig-libaccounts-glib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaccounts-glib0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libxml-2.0 \
pkgconfig-sqlite3 \
typelib-1-0-Accounts-1-0"

inherit rpm

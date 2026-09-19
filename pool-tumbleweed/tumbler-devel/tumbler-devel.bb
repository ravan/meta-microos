SUMMARY = "Development Files for tumbler"
DESCRIPTION = "This package contains the development files needed for developing tumbler \
plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.20.2"

RPM_NAME = "tumbler-devel-4.20.2-1.1.aarch64.rpm"
RPM_HASH = "e63563ae8cef7816293b7b1839c35048bccf394cc3aca2802d02a91e17229fa16dd2be4babbf94663ae8d9076a02218d4685b59e4b4ab7b461fd5bcedbb1c7b9"

RPROVIDES:${PN} += "pkgconfig-tumbler-1 \
tumbler-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gthread-2.0 \
tumbler"

inherit rpm

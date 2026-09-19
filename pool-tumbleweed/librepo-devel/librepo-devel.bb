SUMMARY = "Header files for the Repodata downloading library"
DESCRIPTION = "This package provides the development files for librepo."
LICENSE = "LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "librepo-devel-1.20.0-3.1.aarch64.rpm"
RPM_HASH = "8719b16bb0dbf6bda2164767d639fcdebad353f02d738bb502a1258d86ebf524484a6dbd725b222cc50fde00a74673a2ff70f830fbe92a9f254644e885db6793"

RPROVIDES:${PN} += "librepo-devel \
pkgconfig-librepo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librepo0 \
pkgconfig-glib-2.0 \
pkgconfig-libcurl \
pkgconfig-libxml-2.0 \
pkgconfig-openssl \
pkgconfig-zck"

inherit rpm

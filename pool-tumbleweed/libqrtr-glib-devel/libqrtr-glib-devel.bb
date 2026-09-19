SUMMARY = "Development files for the Qualcomm IPC Router protocol helper library"
DESCRIPTION = "This package provides the development files for the Qualcomm IPC Router protocol helper library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.2"

RPM_NAME = "libqrtr-glib-devel-1.2.2-1.17.aarch64.rpm"
RPM_HASH = "3293ed3afb19f62491dbef493d96e41f9d5b762bd0f1890c5e38b176a16537fc3730dfef2e53a6ae8434920212142107c5da73d75e859eae58fecf376cf73bed"

RPROVIDES:${PN} += "libqrtr-glib-devel \
pkgconfig-qrtr-glib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqrtr-glib0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-Qrtr-1-0"

inherit rpm

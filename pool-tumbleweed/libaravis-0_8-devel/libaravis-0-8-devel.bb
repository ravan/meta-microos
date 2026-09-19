SUMMARY = "Development files for aravis"
DESCRIPTION = "This package contains the development files for aravis"
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.36"

RPM_NAME = "libaravis-0_8-devel-0.8.36-2.3.aarch64.rpm"
RPM_HASH = "d1b46f7b59674cfba62b86a4a1c1d911c38fa2ccf50f80cef54825d2e5d0d347951b054d58dc9adbac5a150fe4a55be51c9fbf45d4dd89d05c9a27c07c35a5bb"

RPROVIDES:${PN} += "libaravis-0-8-devel \
pkgconfig-aravis-0.8"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaravis-0-8-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libusb-1.0 \
pkgconfig-libxml-2.0 \
pkgconfig-zlib"

inherit rpm

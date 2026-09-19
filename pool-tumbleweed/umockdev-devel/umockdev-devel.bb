SUMMARY = "Headers and sources for developing apps with umockdev"
DESCRIPTION = "umockdev mocks Linux devices for creating integration tests for hardware \
related libraries and programs. \
 \
This package provides the headers and sources needed to build software against \
umockdev."
LICENSE = "LGPL-2.1-or-later"

PV = "0.19.7"

RPM_NAME = "umockdev-devel-0.19.7-1.4.aarch64.rpm"
RPM_HASH = "df16b518350927f478eaed493ac2803587024311fc2a89fd1591b3afbd8449cf1b746e447584b195091525ce4dc12f0cc0b709c41700f1e54af01b3fd30b3362"

RPROVIDES:${PN} += "pkgconfig-umockdev-1.0 \
umockdev-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libumockdev-preload0 \
libumockdev0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-UMockdev-1-0 \
umockdev"

inherit rpm

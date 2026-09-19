SUMMARY = "Development files for the Liquid Rescale library"
DESCRIPTION = "The Liquid Rescale (lqr) library provides a C/C++ API for performing \
non-uniform resizing of images by the seam-carving technique. \
 \
This package contains the development files for liblqr."
LICENSE = "LGPL-3.0-only"

PV = "0.4.3"

RPM_NAME = "liblqr-devel-0.4.3-1.1.aarch64.rpm"
RPM_HASH = "320df211c54cf3b241eab600c5949d9d2bf2c7097671f929a4eb01a32c6344a3938d29399bf5612caee855960961d030a2eae25051b03922018c070610f0cbc2"

RPROVIDES:${PN} += "liblqr-devel \
pkgconfig-lqr-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblqr-1-0 \
pkgconfig-glib-2.0"

inherit rpm

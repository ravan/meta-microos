SUMMARY = "Headers for the fingerprint reader library"
DESCRIPTION = "This package contains the header files and development documentation \
for libfprint. If you like to develop programs using libfprint, you \
will need to install this package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.10+tod1"

RPM_NAME = "libfprint-tod-devel-1.94.10+tod1-3.1.aarch64.rpm"
RPM_HASH = "64b23d31344457f9710a5dd080f5139c40154204ba1dd09a18a001ee52a5c921849fa4e2fcae9916e14c87ac5451dafc6b4470c12632ed39cbbcce713f208250"

RPROVIDES:${PN} += "libfprint-tod-devel \
pkgconfig-libfprint-2-tod-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfprint \
libfprint-2-tod1 \
libfprint-devel \
libfprint-tod \
pkgconfig-glib-2.0 \
pkgconfig-gudev-1.0 \
pkgconfig-gusb \
pkgconfig-libfprint-2 \
pkgconfig-nss \
pkgconfig-pixman-1"

inherit rpm

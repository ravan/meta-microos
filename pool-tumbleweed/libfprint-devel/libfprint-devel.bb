SUMMARY = "Headers for the fingerprint reader library"
DESCRIPTION = "This package contains the header files and development documentation \
for libfprint. If you like to develop programs using libfprint, you \
will need to install this package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.10+tod1"

RPM_NAME = "libfprint-devel-1.94.10+tod1-3.1.aarch64.rpm"
RPM_HASH = "8f46df7ce0e186118f30fa7ca1cedc955bdf2f4f553135d7cf109670e0a324386d9061319a52243b4c23325b2604f5f1bb3151e0103ca9cbced173e59d4e52ef"

RPROVIDES:${PN} += "libfprint-devel \
pkgconfig-libfprint-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libfprint \
libfprint-2-2 \
pkgconfig-gio-unix-2.0 \
pkgconfig-gobject-2.0"

inherit rpm

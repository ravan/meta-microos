SUMMARY = "Headers and link library for libzrtpcpp"
DESCRIPTION = "This package provides the header files for building applications that \
use libzrtpcpp."
LICENSE = "GPL-3.0-or-later"

PV = "4.7.0"

RPM_NAME = "libzrtpcpp-devel-4.7.0-3.4.aarch64.rpm"
RPM_HASH = "f864d90f71ede4bf5069cf01dcc9dded8b594a3d8e62d4deeeae1686880054f8015247c9da24b4ce5c7a34d5fedb51f4f484258f77fcad7ad938c71c210a0db2"

RPROVIDES:${PN} += "libzrtpcpp-devel \
pkgconfig-libzrtpcpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ccrtp-devel \
libzrtpcpp4 \
pkgconfig-libcrypto"

inherit rpm

SUMMARY = "Development files for libftxf"
DESCRIPTION = "libftxf is a library for Transactional NTFS (TxF) data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libftxf."
LICENSE = "LGPL-3.0-or-later"

PV = "20260521"

RPM_NAME = "libftxf-devel-20260521-1.6.aarch64.rpm"
RPM_HASH = "6fff94e31487fd9b1d3a429b2a1c1414c9e45aa5eb57f12c7158b8941afccbfe777948993e067ee7ccf0d6ef2aacdd47170334f6cf93a5694d3d52d2a872f4e6"

RPROVIDES:${PN} += "libftxf-devel \
pkgconfig-libftxf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libftxf1"

inherit rpm

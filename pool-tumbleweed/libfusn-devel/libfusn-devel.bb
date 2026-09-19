SUMMARY = "Development files for libfusn"
DESCRIPTION = "libfusn is a library for Update Sequence Number (USN) Journal data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfusn."
LICENSE = "LGPL-3.0-or-later"

PV = "20260522"

RPM_NAME = "libfusn-devel-20260522-1.8.aarch64.rpm"
RPM_HASH = "a1e64e809981d1620480165690eb376c232314ab6a1af952931319c48144f2f916cf2accbf5f103e0868d43b4ad9bb7affb0aeb43b1ee012865ea10e884d0b12"

RPROVIDES:${PN} += "libfusn-devel \
pkgconfig-libfusn"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfusn1"

inherit rpm

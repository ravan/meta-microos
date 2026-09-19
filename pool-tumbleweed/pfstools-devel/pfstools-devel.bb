SUMMARY = "Development files for libpfs, a library for HDR image and video manipulation"
DESCRIPTION = "The pfstools package is a set of command line (and one GUI) programs \
for reading, writing, manipulating and viewing high-dynamic range \
(HDR) images and video frames. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libpfs."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0"

RPM_NAME = "pfstools-devel-2.2.0-5.10.aarch64.rpm"
RPM_HASH = "83138d1f3816e053021a30790d6e991fac8dff8748d280cdde5f96dc2ac62e6e5ab120541153f23f6c8a869dfe99d64ce45fa1a2b46afda5c6eaee05d19e4668"

RPROVIDES:${PN} += "pfstools-devel \
pkgconfig-pfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpfs2"

inherit rpm

SUMMARY = "Development files for libfwps"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfwps."
LICENSE = "LGPL-3.0-or-later"

PV = "20260522"

RPM_NAME = "libfwps-devel-20260522-1.9.aarch64.rpm"
RPM_HASH = "afdc19df2590cb39c8a305cc6291bc2f0e576e6b19bce204cd405448331ee86d1e422b4ed2fc91c742dbc6075f820ce8a2e60ea87d27e40c7e9fe3c8ae0e8748"

RPROVIDES:${PN} += "libfwps-devel \
pkgconfig-libfwps"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfwps1"

inherit rpm

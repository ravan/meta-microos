SUMMARY = "Development files for INIH"
DESCRIPTION = "INI Not Invented Here is a simple parser for .INI files written in C and mostly \
compatible with Python's ConfigParser. \
 \
This package provides the development headers for INIH including the C++ bindings."
LICENSE = "BSD-3-Clause"

PV = "62"

RPM_NAME = "libinih-devel-62-1.5.aarch64.rpm"
RPM_HASH = "2aed9f7dcabc817e0d6e89518268107e4cf87223c9ae4702594e43e342b0ac3ef9266fa6e7d39dfa140245bd82aa661ce13a878dd2eb8fb8369b654b2235c8a9"

RPROVIDES:${PN} += "libinih-devel \
pkgconfig-INIReader \
pkgconfig-inih"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libinih0 \
pkgconfig-inih"

inherit rpm

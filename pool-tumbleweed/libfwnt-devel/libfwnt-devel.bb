SUMMARY = "Development files for libfwnt"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family \
of libraries. libyal is typically used in digital forensic tools. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfwnt."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260602"

RPM_NAME = "libfwnt-devel-20260602-1.5.aarch64.rpm"
RPM_HASH = "e19a38f03d3d93787343d85113a4f081e13806ad43ffae5e7f7b080e9adac0a238eb99bbe8ef63002bcdcfbe531c53a0095be74a7962b144ee193f642e2c648c"

RPROVIDES:${PN} += "libfwnt-devel \
pkgconfig-libfwnt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfwnt1"

inherit rpm

SUMMARY = "Development files for libcdirectory"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family of libraries.  libyal is typically used in digital forensic tools. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcdirectory."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260703"

RPM_NAME = "libcdirectory-devel-20260703-1.2.aarch64.rpm"
RPM_HASH = "57a15ac7d2eb6e70b58839d6fca530b28b672069e37ed4c79618e6f91bfa5f5095bf443a01f93cde42c902298a0147545be08fa2c5ed41137c7e97a8e2c6f2f2"

RPROVIDES:${PN} += "libcdirectory-devel \
pkgconfig-libcdirectory"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcdirectory1"

inherit rpm

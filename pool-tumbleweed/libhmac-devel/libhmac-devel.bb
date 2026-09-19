SUMMARY = "Development files for libhmac"
DESCRIPTION = "Development files for libhmac, a library to support various Hash-based Message Authentication Codes (HMAC). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libhmac."
LICENSE = "LGPL-3.0-or-later"

PV = "20260522"

RPM_NAME = "libhmac-devel-20260522-1.10.aarch64.rpm"
RPM_HASH = "cfe4186372d44711a821c0ec6a596aae7eb6b110fa7005f09b8ca283d33395ed42b4d8956f90d0862ba8b6d8bd75fbc5f23a84dc5dd0f1959c8466414b5762bd"

RPROVIDES:${PN} += "libhmac-devel \
pkgconfig-libhmac"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhmac1"

inherit rpm

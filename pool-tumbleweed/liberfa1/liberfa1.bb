SUMMARY = "Essential Routines for Fundamental Astronomy"
DESCRIPTION = "ERFA is a C library containing key algorithms for astronomy, and is based on \
the SOFA library published by the International Astronomical Union (IAU). \
 \
ERFA is intended to replicate the functionality of SOFA (aside from possible \
bugfixes in ERFA that have not yet been included in SOFA), but is licensed \
under a three-clause BSD license to enable its compatibility with a wide \
range of open source licenses. Permission for this release has been obtained \
from the SOFA board, and is avilable in the LICENSE file included in this \
source distribution."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "liberfa1-2.0.1-1.11.aarch64.rpm"
RPM_HASH = "f27fdad9d34200bb1e0d5052eb94a359611ed8e763521d76c05e940c2220d8df7bd35b73b383ac6cb85e45340730fe56c44a896a3b475225aacf2db49c15556f"

RPROVIDES:${PN} += "liberfa.so.1 \
liberfa1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

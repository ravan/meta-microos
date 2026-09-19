SUMMARY = "C++ bindings/wrapper for GPGME"
DESCRIPTION = "GPGME++ is a C++ wrapper (or C++ bindings) for the GnuPG project's GPGME \
(GnuPG Made Easy) library, version 0.4.4 and later. \
 \
This package contains the shared library."
LICENSE = "LGPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "libgpgmepp7-2.2.0-1.1.aarch64.rpm"
RPM_HASH = "876af8f59cbb8b4ac0323eb4741ed38d8c5d1688934b881aa113f1bb8715fee44c12b13a59fe9e449117d5009630fc66e76f62514c6eaa964c4f498fcd7b1723"

RPROVIDES:${PN} += "libgpgmepp.so.7 \
libgpgmepp7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgpgme.so.45 \
libstdc++.so.6"

inherit rpm

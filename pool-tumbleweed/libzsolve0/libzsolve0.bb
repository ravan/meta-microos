SUMMARY = "Library for solving linear systems over integers for 4ti2"
DESCRIPTION = "This package contains the 4ti2 library for solving systems linear systems over \
integers (\\mathbb{Z})."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.15"

RPM_NAME = "libzsolve0-1.6.15-1.3.aarch64.rpm"
RPM_HASH = "40e49c5850e674b815734175897ef42fc24b2f821e24614e21a69a848624829980ec4bf5b1730a22e16ea1a491ad8a3ed1097720c3e397c85b6f22d30d1b72e5"

RPROVIDES:${PN} += "libzsolve.so.0 \
libzsolve0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libstdc++.so.6"

inherit rpm

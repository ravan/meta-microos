SUMMARY = "C++ bindings for the GNU MP Library"
DESCRIPTION = "GMP is a library for arbitrary precision arithmetic, operating on \
signed integers, rational numbers, and floating-point numbers. \
 \
This package contains C++ bindings for the GNU MP Library."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "6.3.0"

RPM_NAME = "libgmpxx4-6.3.0-5.6.aarch64.rpm"
RPM_HASH = "1755246b8937938dfb8526d87ba7a5447d333c8c4c1c7909953b7c57b349a449c11b69a3554b8484e644abf47c2cd8ec5870ace23abcf1e645d5d9378799777d"

RPROVIDES:${PN} += "libgmpxx.so.4 \
libgmpxx4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmp10 \
libstdc++.so.6"

inherit rpm

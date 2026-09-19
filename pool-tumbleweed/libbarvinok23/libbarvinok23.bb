SUMMARY = "Library for computing homotopy continuation of roots"
DESCRIPTION = "This is a library for computing homotopy continuation of a given root \
of one dimensional sections of bivariate complex polynomials."
LICENSE = "GPL-2.0-or-later"

PV = "0.41.8"

RPM_NAME = "libbarvinok23-0.41.8-1.8.aarch64.rpm"
RPM_HASH = "7bedabf829ec1d89d767ec446958d33a2b561fd13dde77df0c74ee885634d5caea71532b168c358b9e872ef07492b7757696580a31e0f865a72dab0f072bed7b"

RPROVIDES:${PN} += "libbarvinok.so.23 \
libbarvinok23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglpk.so.40 \
libgmp.so.10 \
libisl.so.23 \
libntl.so.45 \
libpolylibgmp.so.8 \
libstdc++.so.6"

inherit rpm

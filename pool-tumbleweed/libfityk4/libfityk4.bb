SUMMARY = "Library for non-linear curve fitting and data analysis"
DESCRIPTION = "Fityk is a program for nonlinear curve-fitting of analytical \
functions (especially peak-shaped) to data (usually experimental \
data). It can also be used for visualization of x-y data only."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "libfityk4-1.3.2-2.6.aarch64.rpm"
RPM_HASH = "a22eff5cf000c4023a5c3da11aeefb17c5a1e70eea1364f95a9792a18c2ed8b2661568b4142762952cfceb6d411e6a00154924da9e6aa6a8a6d32a95799e44e0"

RPROVIDES:${PN} += "libfityk.so.4 \
libfityk4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libm.so.6 \
libnlopt.so.1 \
libstdc++.so.6 \
libxy.so.3 \
libz.so.1"

inherit rpm

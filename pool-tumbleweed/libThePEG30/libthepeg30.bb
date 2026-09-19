SUMMARY = "Toolkit providing a common platform for event generators in C++"
DESCRIPTION = "ThePEG project is a toolkit for providing a common platform for using and \
building event generators in C++. \
 \
This package provides the shared libraries for ThePEG."
LICENSE = "GPL-2.0-only"

PV = "2.3.0"

RPM_NAME = "libThePEG30-2.3.0-2.3.aarch64.rpm"
RPM_HASH = "59c889b7d06158e7869bffddfeefac3ae9d1f14bc9c1c6349c0bb4c1888a43da51c81f57daff52005154ec2d45f75a425025b2fea6659e2c756bbf0ae06befd9"

RPROVIDES:${PN} += "config-libThePEG30 \
libThePEG.so.30 \
libThePEG30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libHepMC3.so.4 \
libLHAPDF-6.5.5.so \
libc.so.6 \
libfastjet.so.0 \
libgcc-s.so.1 \
libgmp.so.10 \
libgsl.so.28 \
libgslcblas.so.0 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

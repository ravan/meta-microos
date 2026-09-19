SUMMARY = "C++ library of math, signal processing and communication routines"
DESCRIPTION = "IT++ is a C++ library of mathematical, signal processing and \
communication classes and functions. Its main use is in simulation of \
communication systems and for performing research in the area of \
communications. The kernel of the library consists of generic vector and \
matrix classes, and a set of accompanying routines. Such a kernel makes \
IT++ similar to MATLAB or GNU Octave."
LICENSE = "GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "libitpp8-4.3.1-1.3.aarch64.rpm"
RPM_HASH = "3486ee2985f731eb999267d6076f94b28d01b4d9232d5664730c0eda3d4dc8c0f41f1061ae44ad288cc2d593f7fbecf0a28816cc87669d969ed40964a233ed6f"

RPROVIDES:${PN} += "libitpp.so.8 \
libitpp8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
liblapack.so.3 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

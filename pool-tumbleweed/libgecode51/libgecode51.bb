SUMMARY = "C++ toolkit for developing constraint-based systems"
DESCRIPTION = "Gecode is an open source C++ toolkit for developing constraint-based \
systems and applications. Gecode provides a constraint solver with \
state-of-the-art performance while being modular and extensible."
LICENSE = "MIT"

PV = "6.3.0~git20211208.6b09bea4"

RPM_NAME = "libgecode51-6.3.0~git20211208.6b09bea4-1.16.aarch64.rpm"
RPM_HASH = "de43b8adbf6099e33d33464caf7f9f1046bf0d6b2e293a9f9b356c224be92aea3559c5c393e827c17c007de4eee9b1aa12cf21a4044e39ce9cb3f41e1b7795f9"

RPROVIDES:${PN} += "libgecode51 \
libgecodedriver.so.51 \
libgecodefloat.so.51 \
libgecodeint.so.51 \
libgecodekernel.so.51 \
libgecodeminimodel.so.51 \
libgecodesearch.so.51 \
libgecodeset.so.51 \
libgecodesupport.so.51"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

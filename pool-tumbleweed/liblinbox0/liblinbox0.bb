SUMMARY = "C++ library for computation with matrices over ints and finite fields"
DESCRIPTION = "LinBox is a C++ template library for exact, high-performance linear \
algebra computation with dense, sparse, and structured matrices over \
the integers and over finite fields."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.1"

RPM_NAME = "liblinbox0-1.7.1-1.5.aarch64.rpm"
RPM_HASH = "a0e0de62fafe2544bbd2f7bd4ccac515732bb71db5ca0675cb3898e606c273acdd647f31eeec830133eda400f15aa49e32d100be99d8f983785a9f297f54bf04"

RPROVIDES:${PN} += "liblinbox.so.0 \
liblinbox0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

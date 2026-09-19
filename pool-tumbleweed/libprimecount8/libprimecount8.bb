SUMMARY = "C/C++ library for counting prime numbers"
DESCRIPTION = "This package contains the shared runtime library for primecount."
LICENSE = "BSD-2-Clause"

PV = "8.7"

RPM_NAME = "libprimecount8-8.7-1.1.aarch64.rpm"
RPM_HASH = "b921b22f2a06ffbe92ce9150330aef82bc7d91db78c296f972bf678bbc146d199713411c25b393b975cfc861df267081be5d2d89477735889104a637b665d07e"

RPROVIDES:${PN} += "libprimecount.so.8 \
libprimecount8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libprimesieve.so.12 \
libstdc++.so.6"

inherit rpm

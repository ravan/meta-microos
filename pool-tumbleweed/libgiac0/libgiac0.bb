SUMMARY = "The core library for giac"
DESCRIPTION = "A computer algebra system, compatible with existing CAS, as a C++ \
library with various user interfaces (GUI with formal spreadsheet and exact \
dynamic geometry, on-line, readline, emacs, texmacs...)."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "libgiac0-2.0.0-2.6.aarch64.rpm"
RPM_HASH = "19c7a0b606078f40b078d54f2ae1a8536ccd56e1f93b4980405105ec4cdbb6a36ca06e71995d7937286b70f5082660a51fed5e7f5a1284e4cbce2c3bacd22c1a"

RPROVIDES:${PN} += "libgiac.so.0 \
libgiac0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libao.so.4 \
libblas.so.3 \
libc.so.6 \
libcurl.so.4 \
libecm.so.1 \
libgcc-s.so.1 \
libglpk.so.40 \
libgmp.so.10 \
libgsl.so.28 \
libgslcblas.so.0 \
liblapack.so.3 \
libm.so.6 \
libmpfi.so.0 \
libmpfr.so.6 \
libnauty-2.9.3.so \
libntl.so.45 \
libpari-gmp-tls.so.9 \
libpng16.so.16 \
libsamplerate.so.0 \
libstdc++.so.6"

inherit rpm

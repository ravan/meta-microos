SUMMARY = "Real Embedded Algebraic Number Theory library in C"
DESCRIPTION = "E-ANTIC is a C/C++ library to deal with real embedded number fields \
built on top of ANTIC."
LICENSE = "LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "libeantic3-2.1.1-2.3.aarch64.rpm"
RPM_HASH = "1043e9bcb380b8f145bacd44ee8af64a4a58ed0c554df08cd13b6993b5c64c9eb5a7f64231ce2081090120b828a96a43508e21254f93d0c3e5d530da4095e190"

RPROVIDES:${PN} += "libeantic.so.3 \
libeantic3 \
libeanticxx.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libflint.so.24 \
libgcc-s.so.1 \
libgmp.so.10 \
libstdc++.so.6"

inherit rpm

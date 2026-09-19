SUMMARY = "C++ library for arbitrary precision decimal floating point arithmetic"
DESCRIPTION = "libmpdec++ is a C++ implementation of the General Decimal Arithmetic \
Specification. The specification defines a general purpose arbitrary \
precision data type together with rigorously specified functions and \
rounding behavior. libmpdec conforms - with minor restrictions - to \
the IEEE 754-2008 Standard for Floating-Point Arithmetic."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libmpdec++4-4.0.1-2.6.aarch64.rpm"
RPM_HASH = "f7e6b62bb7f3c20f1d7c678b0147b042908024324caac839cb26f57f8a843a5ec6c571d6c484814a2d62245d3266093a093ad28d1805ea29adc31f5d691f6f34"

RPROVIDES:${PN} += "libmpdec++.so.4 \
libmpdec++4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpdec.so.4 \
libmpdec4 \
libstdc++.so.6"

inherit rpm

SUMMARY = "C library for arbitrary precision decimal floating point arithmetic"
DESCRIPTION = "libmpdec is a C implementation of the General Decimal Arithmetic \
Specification. The specification defines a general purpose arbitrary \
precision data type together with rigorously specified functions and \
rounding behavior. libmpdec conforms - with minor restrictions - to \
the IEEE 754-2008 Standard for Floating-Point Arithmetic."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libmpdec4-4.0.1-2.6.aarch64.rpm"
RPM_HASH = "f5656fb6d0e43a61f0a99aa57a7152853a87fac9cf89dedc28855a62f2dc30aa357b8a481665450c3f06c82ddf05bcfc2dea2cc63975a02fbe11cd05ad34f59c"

RPROVIDES:${PN} += "libmpdec.so.4 \
libmpdec4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

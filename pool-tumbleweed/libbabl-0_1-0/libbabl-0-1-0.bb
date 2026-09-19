SUMMARY = "Dynamic Pixel Format Translation Library"
DESCRIPTION = "babl is a dynamic, any to any, pixel format translation library. \
 \
It allows converting between different methods of storing pixels known \
as pixel formats that have with different bitdepths and other data \
representations, color models and component permutations. \
 \
A vocabulary to formulate new pixel formats from existing primitives is \
provided as well as the framework to add new color models and data \
types."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.1.128"

RPM_NAME = "libbabl-0_1-0-0.1.128-1.1.aarch64.rpm"
RPM_HASH = "43e85a0dd1e8adf002f7cc8aecd3af8818a363bc905955b1c93e3837dc997f553a180de68549d3c1314d34e3dd5bea51658dcaf19c59c1ab88f87c131fd03fed"

RPROVIDES:${PN} += "libbabl-0-1-0 \
libbabl-0.1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblcms2.so.2 \
libm.so.6"

inherit rpm

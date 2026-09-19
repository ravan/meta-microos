SUMMARY = "The Oil Runtime Compiler Library"
DESCRIPTION = "Orc is a library and set of tools for compiling and executing very simple \
programs that operate on arrays of data.  The “language” is a generic \
assembly language that represents many of the features available in SIMD \
architectures, including saturated addition and subtraction, and many \
arithmetic operations."
LICENSE = "BSD-3-Clause"

PV = "0.4.44"

RPM_NAME = "liborc-0_4-0-0.4.44-1.1.aarch64.rpm"
RPM_HASH = "53674481e637616a89d69954aa68a49ee3e90dfe5ed57145a0f533e1c244bb59d2f3b350b39384342b4a98fe1b9b28a68af4ec12afdb2cc7ef7e51025bee72f0"

RPROVIDES:${PN} += "liborc-0-4-0 \
liborc-0.4.so.0 \
liborc-test-0.4.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

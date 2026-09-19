SUMMARY = "The Oil Runtime Compiler"
DESCRIPTION = "Orc is a library and set of tools for compiling and executing very simple \
programs that operate on arrays of data.  The “language” is a generic \
assembly language that represents many of the features available in SIMD \
architectures, including saturated addition and subtraction, and many \
arithmetic operations."
LICENSE = "BSD-3-Clause"

PV = "0.4.44"

RPM_NAME = "orc-0.4.44-1.1.aarch64.rpm"
RPM_HASH = "dca38044b792bb28c0e8e3928a8706271f83954528919f68c7c9afe2eec7f24b7c3a37c18c49c787f9177a1efd570c4d8a6e78dc4e8adc81d1df08035ba5ac12"

RPROVIDES:${PN} += "orc \
orc-devel \
pkgconfig-orc-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
liborc-0.4.so.0"

inherit rpm

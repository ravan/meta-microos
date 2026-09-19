SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "cross-avr-gcc15-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "6a16cf93f73d4682b59bde4d854ad244525fea28c2d62474ff352899b72256e72d66c0d69497e012ac4b2450247768859fd68129aa62d537e0328c4aa8fde77a"

RPROVIDES:${PN} += "avr-gcc \
cross-avr-gcc15"

RDEPENDS:${PN} += "cross-avr-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc15 \
libz.so.1 \
libzstd.so.1"

inherit rpm

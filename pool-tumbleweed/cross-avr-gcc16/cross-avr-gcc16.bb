SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-avr-gcc16-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "a417ef2435388a006adf8809a9374e166929757230f680c24e372d00846238222a627bb823af7c8ea53b1df34e3e8d620c74c21f5f14a41cb6171d52a0abd9a7"

RPROVIDES:${PN} += "avr-gcc \
cross-avr-gcc16"

RDEPENDS:${PN} += "cross-avr-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc16 \
libz.so.1 \
libzstd.so.1"

inherit rpm

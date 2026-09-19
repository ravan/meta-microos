SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-avr-gcc7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "14ad607e57cd1decf1619ab92964ec7d62a4a81419edc089ae8808d6934642b1b93cabd078cbd75eef70e64edbc9e59ce180c4432869a72fca620677468f949c"

RPROVIDES:${PN} += "avr-gcc \
cross-avr-gcc7 \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-avr-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm

SUMMARY = "GNU GCC COBOL Compiler"
DESCRIPTION = "This package contains a COBOL compiler."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "gcc16-cobol-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "b612e2c556c1fd488882fe1f63f28bb2bbda571070279963b2b34a9c7d1a85b9116230a87974adb5689585908a67de7e7ef89e2cdb4b194847315adb72b04943"

RPROVIDES:${PN} += "gcc16-cobol"

RDEPENDS:${PN} += "/usr/bin/sh \
gcc16 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgcobol2 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++.so.6 \
libxml2.so.16 \
libz.so.1 \
libzstd.so.1"

inherit rpm

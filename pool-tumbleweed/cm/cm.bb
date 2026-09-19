SUMMARY = "Class polynomial computation via floating point approximations"
DESCRIPTION = "The CM software implements the construction of ring class fields of \
imaginary quadratic number fields and of elliptic curves with complex \
multiplication via floating point approximations."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.4"

RPM_NAME = "cm-0.4.4-1.7.aarch64.rpm"
RPM_HASH = "3bdae11f31bd3536bc48618d951288996bf7b72cd605b75fa3a81a3edeb23b27bc4dada2b6d54315b4d6136ea80f944a6e2931eb18d6948c80c2871f05cc9bf5"

RPROVIDES:${PN} += "cm"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcm.so.1 \
libgmp.so.10 \
libmpc.so.3 \
libmpfr.so.6 \
libmpfrcx.so.1"

inherit rpm

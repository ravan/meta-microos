SUMMARY = "A Symbolic Manipulation System"
DESCRIPTION = "FORM is a Symbolic Manipulation System. It reads symbolic expressions from files \
and executes symbolic/algebraic transformations upon them. The answers are \
returned in a textual mathematical representation. As its landmark feature, the \
size of the considered expressions in FORM is only limited by the available \
disk space and not by the available RAM."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.0"

RPM_NAME = "form-5.0.0-1.6.aarch64.rpm"
RPM_HASH = "6f78bf084ced75977643edb8821eee0c15a617f6b75283051f7dddfe77bf0dc57f3d0f6aad4e51c2d4d84476a2e6518aac88c036f41c4492dde39452e9ce0019"

RPROVIDES:${PN} += "form"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6 \
libmpi.so.40 \
libstdc++.so.6 \
libz.so.1 \
openmpi5-libs"

inherit rpm

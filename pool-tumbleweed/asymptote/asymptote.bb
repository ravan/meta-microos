SUMMARY = "2D & 3D TeX-Aware vector graphics language"
DESCRIPTION = "Asymptote is a descriptive vector graphics language for technical \
drawing, inspired by MetaPost, but with a C++-like syntax. Asymptote \
provides for figures the same quality of typesetting that LaTeX does \
for scientific text."
LICENSE = "LGPL-3.0-or-later"

PV = "3.09"

RPM_NAME = "asymptote-3.09-1.6.aarch64.rpm"
RPM_HASH = "7f25e925e18d782886894c494646c62160f19714f799e40c5bd45311d2cee0a6aca109f6f98146017656c78acd5e9a55559b59e94f9043e8a958a561cee7456d"

RPROVIDES:${PN} += "asymptote"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgc.so.1 \
libgcc-s.so.1 \
libglut.so.3 \
libgsl.so.28 \
libgslcblas.so.0 \
libm.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
libtinfo.so.6 \
libtirpc.so.3 \
libz.so.1"

inherit rpm

SUMMARY = "Freecell Solver library"
DESCRIPTION = "This package contains the Freecell Solver library which can be used by some \
programs to solves Freecell and other card games."
LICENSE = "MIT"

PV = "6.16.0"

RPM_NAME = "libfreecell-solver0-6.16.0-1.5.aarch64.rpm"
RPM_HASH = "d42f1ef9afe7513cdfdf2edb489f2cf93de81cc64af1776e9abfe938867c25f334820c1acf985d0c66fd87e280b82b425c3365b2dc39457edfa65adc8bc0bb7b"

RPROVIDES:${PN} += "libfreecell-solver.so.0 \
libfreecell-solver0"

RDEPENDS:${PN} += "/sbin/ldconfig \
freecell-solver-presets \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

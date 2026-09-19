SUMMARY = "Molecular point group symmetry library"
DESCRIPTION = "A C library dealing with point group symmetry in molecules."
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "libmsym0_2-0.2.3-4.3.aarch64.rpm"
RPM_HASH = "2b2c25a9d3180f9fc2dce2631e6ed68c21ea1112c7121742891874a21c48fe359a135d73663e99eb80f2863acc2508d236c6ae3f75d5d9344434f1a22c378a36"

RPROVIDES:${PN} += "libmsym.so.0.2 \
libmsym0-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

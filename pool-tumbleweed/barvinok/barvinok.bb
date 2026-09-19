SUMMARY = "Library for computing homotopy continuation of roots"
DESCRIPTION = "This is a library for computing homotopy continuation of a given root \
of one dimensional sections of bivariate complex polynomials."
LICENSE = "GPL-2.0-or-later"

PV = "0.41.8"

RPM_NAME = "barvinok-0.41.8-1.8.aarch64.rpm"
RPM_HASH = "9a10856c67f2b135d05cbad40fb700714409c300fd0c373325c06d0195cee4d7848b010b51d7eb82e9773c738b5ec4843be44642f335865e2ec618209545997d"

RPROVIDES:${PN} += "barvinok \
bundled-4ti2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbarvinok.so.23 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libisl.so.23 \
libntl.so.45 \
libpolylibgmp.so.8 \
libstdc++.so.6"

inherit rpm

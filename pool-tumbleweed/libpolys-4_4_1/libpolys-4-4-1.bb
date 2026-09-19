SUMMARY = "Singular's POLYS library"
DESCRIPTION = "Data structures and basic algorithms for polynomials \
in Singular"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.4.1"

RPM_NAME = "libpolys-4_4_1-4.4.1-2.9.aarch64.rpm"
RPM_HASH = "384f6cc1d237cc6a9b6f1a75e121dda9cce82cf95bc422b4bd1ab7b652e01fc60a37eae3489aaf04bbba3265677cc2b5852074f4902b03363ac0ea8278197bcf"

RPROVIDES:${PN} += "libpolys-4-4-1 \
libpolys-4.4.1.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfactory-4.4.1.so \
libflint.so.24 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libntl.so.45 \
libomalloc-4.4.1.so \
libsingular-resources-4.4.1.so \
libstdc++.so.6"

inherit rpm

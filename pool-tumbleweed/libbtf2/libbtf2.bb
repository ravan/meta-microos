SUMMARY = "Permutation to Block Triangular Form"
DESCRIPTION = "BTF permutes an unsymmetric matrix (square or rectangular) into its \
block upper triangular form (more precisely, it computes a Dulmage- \
Mendelsohn decomposition). \
 \
BTF is part of the SuiteSparse sparse matrix suite."
LICENSE = "LGPL-2.1-or-later"

PV = "7.14.0"

RPM_NAME = "libbtf2-7.14.0-1.1.aarch64.rpm"
RPM_HASH = "04d7b37d30d83d63ce0e919540c68dbabebba3d6e26de19b267a0c708a41646d54a9c09a89822788f6e9090eb471ed304128570a74972e2c83e45e0c9a62adc2"

RPROVIDES:${PN} += "libbtf.so.2 \
libbtf2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm

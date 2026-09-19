SUMMARY = "Parallelized Implementation of bzip2"
DESCRIPTION = "PBZIP2 is a parallel implementation of the bzip2 block-sorting file \
compressor that uses pthreads and achieves near-linear speedup on SMP \
machines."
LICENSE = "BSD-4-Clause"

PV = "1.1.13"

RPM_NAME = "pbzip2-1.1.13-4.9.aarch64.rpm"
RPM_HASH = "c8354f1badf1f23c13abe3bf25230b71e9887fe91d4113fa5b447e7890de6a37946e75adce1c3e32ad0860bdf3607c25c94f1ba31b3d17a1229f17bd288d8867"

RPROVIDES:${PN} += "pbzip2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

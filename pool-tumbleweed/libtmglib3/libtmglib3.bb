SUMMARY = "Test Matrix Generator Library: shared library"
DESCRIPTION = "This package provides the shared library for tmglib, the Test Matrix Generator \
Library."
LICENSE = "BSD-3-Clause"

PV = "3.12.1"

RPM_NAME = "libtmglib3-3.12.1-5.1.aarch64.rpm"
RPM_HASH = "309b9c85af2327e74b55675a110b3addc0ab732d4ffab4259092c032254c7359503e7ff9e745f07a923408d271827f34fc1dbe9c501028b8fb702b9b71c09e52"

RPROVIDES:${PN} += "libtmglib.so.3 \
libtmglib3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmvec.so.1"

inherit rpm

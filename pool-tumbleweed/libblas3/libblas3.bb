SUMMARY = "Basic Linear Algebra Subprograms: Shared Library"
DESCRIPTION = "BLAS (Basic Linear Algebra Subprograms) is a standard library for \
numerical algebra.  BLAS provides a number of basic algorithms for \
linear algebra. \
 \
This package provides the shared library for BLAS."
LICENSE = "BSD-3-Clause"

PV = "3.12.1"

RPM_NAME = "libblas3-3.12.1-5.1.aarch64.rpm"
RPM_HASH = "c907315ae4354d7bb60b64144901d0aa2b5e69d00b332416f70e03263eea46c5bb7d4633f142ca626af94e9af3d7c4421fbcf6be008c824b835a9608a7358bd6"

RPROVIDES:${PN} += "libblas.so.3 \
libblas3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
update-alternatives"

inherit rpm

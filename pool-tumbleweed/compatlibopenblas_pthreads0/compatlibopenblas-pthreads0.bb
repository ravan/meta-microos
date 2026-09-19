SUMMARY = "Compatiblity library containing OpenBLAS pthreads via update-alternatives"
DESCRIPTION = "OpenBLAS for pthreads which can replace other BLAS versions with the help of \
update-alternatives. \
Incompatible with transactional enabled OS installations."
LICENSE = "BSD-3-Clause"

PV = "0.3.34"

RPM_NAME = "compatlibopenblas_pthreads0-0.3.34-1.1.aarch64.rpm"
RPM_HASH = "f52c7bdab99ed6ea0c1a72a302f833be424e33097191e8ab23c1161fd1000d00295a0fef87a9c14fc49e8c79db6acd6e5207a5f610fe945f15322cb5901c344b"

RPROVIDES:${PN} += "compatlibopenblas-pthreads0 \
libopenblas.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
libopenblas-pthreads0 \
update-alternatives"

inherit rpm

SUMMARY = "Compatiblity library containing OpenBLAS openmp via update-alternatives"
DESCRIPTION = "OpenBLAS for openmp which can replace other BLAS versions with the help of \
update-alternatives. \
Incompatible with transactional enabled OS installations."
LICENSE = "BSD-3-Clause"

PV = "0.3.34"

RPM_NAME = "compatlibopenblas_openmp0-0.3.34-1.1.aarch64.rpm"
RPM_HASH = "060047e5eefdb42048a7a3b4daf0e8007a06a1ae151d2740839079cb28ba002cb50932a5b886240eb6364119de27687977d0e835346941b96a0419a2ab5b0dc1"

RPROVIDES:${PN} += "compatlibopenblas-openmp0 \
libopenblas.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
libopenblas-openmp0 \
update-alternatives"

inherit rpm

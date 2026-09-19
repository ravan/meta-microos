SUMMARY = "Compatiblity library containing OpenBLAS serial via update-alternatives"
DESCRIPTION = "OpenBLAS for serial which can replace other BLAS versions with the help of \
update-alternatives. \
Incompatible with transactional enabled OS installations."
LICENSE = "BSD-3-Clause"

PV = "0.3.34"

RPM_NAME = "compatlibopenblas_serial0-0.3.34-1.1.aarch64.rpm"
RPM_HASH = "ac4b23edb24379f0f46da6cd550c3be5eb47e9eeb854317dfaa47853546a7edd431b2677a77aedb2be84391d1d007dfa13832c9c14ab4eb867ef1a0423d66984"

RPROVIDES:${PN} += "compatlibopenblas-serial0 \
libopenblas.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
libopenblas-serial0 \
update-alternatives"

inherit rpm

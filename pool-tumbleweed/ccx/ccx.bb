SUMMARY = "An open source finite element package"
DESCRIPTION = "CalculiX is a package designed to solve field problems. \
The method used is the finite element method. So far only \
structural problems can be solved but it is planned to \
extend the capabilities."
LICENSE = "BSD-3-Clause & GPL-2.0-only & SUSE-Public-Domain"

PV = "2.23"

RPM_NAME = "ccx-2.23-1.4.aarch64.rpm"
RPM_HASH = "64f8fccfbef2a5e8becb6c839b16e392358126557a37978dec930c38c0314a629ae80e4f71107881956ca9149f2581598090e086aaa9048558be1a9a30e67f69"

RPROVIDES:${PN} += "ccx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarpack.so.2 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmvec.so.1 \
libspooles.so.2.2"

inherit rpm

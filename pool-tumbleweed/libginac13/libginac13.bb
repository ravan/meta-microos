SUMMARY = "C++ library for symbolic calculations"
DESCRIPTION = "GiNaC (which stands for 'GiNaC is Not a CAS (Computer Algebra System)') is an \
open framework for symbolic computation within the C++ programming language."
LICENSE = "GPL-2.0-only"

PV = "1.8.10"

RPM_NAME = "libginac13-1.8.10-1.4.aarch64.rpm"
RPM_HASH = "0ede194aa0fe9f4ad192296499e5c0ecba149a42f5289b932cb954b2b424fefbe6796345023ab5eb000cefd4638f15fa3dfd14acb40f792c174a8ccacc22e5df"

RPROVIDES:${PN} += "libginac.so.13 \
libginac13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcln.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

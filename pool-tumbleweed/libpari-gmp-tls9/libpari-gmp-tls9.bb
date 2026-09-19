SUMMARY = "Shared library for the PARI Computer Algebra System"
DESCRIPTION = "PARI/GP is a computer algebra system designed for computations \
in number theory. \
This package contains shared library for the PARI CAS."
LICENSE = "GPL-2.0-only"

PV = "2.17.4"

RPM_NAME = "libpari-gmp-tls9-2.17.4-1.3.aarch64.rpm"
RPM_HASH = "e9c9f00e958041b12374ef4efa8d11a5112c85c69f3b6b8c5428bc661bad2edbbda1cb55dd0577bf91f32ab96890df6a71c5d4a746dab42d822b30baedb325c8"

RPROVIDES:${PN} += "libpari-gmp \
libpari-gmp-tls.so.9 \
libpari-gmp-tls9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm

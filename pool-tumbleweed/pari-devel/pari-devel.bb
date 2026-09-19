SUMMARY = "Headers for the PARI Computer Algebra System"
DESCRIPTION = "PARI/GP is a computer algebra system designed for computations \
in number theory. \
This package contains C API headers for the PARI CAS."
LICENSE = "GPL-2.0-only"

PV = "2.17.4"

RPM_NAME = "pari-devel-2.17.4-1.3.aarch64.rpm"
RPM_HASH = "71b4328ec65d525d9701a8753bcb9a9fb83b50a9140ecacf4d3b485611124bcbac9ec7b386b66e5a3bbffa8306b1d74e22fa7c6984ce694013ff88d3d0eaa50d"

RPROVIDES:${PN} += "pari-devel"

RDEPENDS:${PN} += "libpari-gmp-tls9"

inherit rpm

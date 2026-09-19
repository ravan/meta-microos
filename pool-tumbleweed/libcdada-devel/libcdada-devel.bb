SUMMARY = "Development files for libcdada"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use libcdada."
LICENSE = "BSD-2-Clause"

PV = "0.6.4"

RPM_NAME = "libcdada-devel-0.6.4-1.3.aarch64.rpm"
RPM_HASH = "7ed80d0663a8ae314e775272394cbf6864a3721448eac7ce6e10c800f2042ea0646d8d67a8cb37be9886549ea377f86e63e926a4456a8751e32fe42323a8cd1f"

RPROVIDES:${PN} += "libcdada-devel"

RDEPENDS:${PN} += "/usr/bin/python3 \
libcdada0 \
python3"

inherit rpm

SUMMARY = "BSD process resource limit and priority functions"
DESCRIPTION = "BSD process resource limit and priority functions"
LICENSE = "Artistic-2.0 | LGPL-2.0-only"

PV = "1.291.100"

RPM_NAME = "perl-BSD-Resource-1.291.100-1.8.aarch64.rpm"
RPM_HASH = "262ce294729af263d8bce78ef8249b66462abd4c5f286b4e2fbe5951db02d5c0785920ab5202f86b668cf4e214dc0ff1ecb8cc2730900bd8db0f87465e01582e"

RPROVIDES:${PN} += "perl-BSD--Resource \
perl-BSD-Resource"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm

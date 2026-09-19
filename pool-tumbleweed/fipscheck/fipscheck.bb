SUMMARY = "A library for integrity verification of FIPS validated modules"
DESCRIPTION = "FIPSCheck is a library for integrity verification of FIPS validated \
modules. The package also provides helper binaries for creation and \
verification of the HMAC-SHA256 checksum files."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "fipscheck-1.7.0-2.12.aarch64.rpm"
RPM_HASH = "c8a94ed116c127882965e8d9438e8293fb7e11cc46f6407c3e6de641e5aeb9a8c1b1606fc8299c6b7b1e8454b768d539d8f97b22c18ca521828416dee0a12819"

RPROVIDES:${PN} += "fipscheck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfipscheck.so.1 \
libfipscheck1"

inherit rpm

SUMMARY = "Test suite for the uDAPL library"
DESCRIPTION = "Test suite to validate the uDAPL library APIs."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "dapl-utils-2.1.10-9.6.aarch64.rpm"
RPM_HASH = "3bec77b384c64465f4b3f6ef95892179650ef2c12e2e27ebd16d1a8808843f02f1bd23b54385d5ced6bc49ccbbedab3ac4fe15e103ef75eb2d26f1e392856711"

RPROVIDES:${PN} += "dapl-utils"

RDEPENDS:${PN} += "dapl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdat2.so.2"

inherit rpm

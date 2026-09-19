SUMMARY = "Test suite for the uDAPL library"
DESCRIPTION = "Test suite to validate the uDAPL library APIs."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "dapl-debug-utils-2.1.10-9.6.aarch64.rpm"
RPM_HASH = "e8d53723082a3888ec905583bd7d94b9b4df785485165b23db1fb3c2175dcd61c444891740476d1a76ee67aef571295a99879d1faa941d26bce6e5a0c9da393c"

RPROVIDES:${PN} += "dapl-debug-utils"

RDEPENDS:${PN} += "dapl-debug \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdat2.so.2"

inherit rpm

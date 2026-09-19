SUMMARY = "Development files for pystring"
DESCRIPTION = "Development files for pystring."
LICENSE = "BSD-2-Clause"

PV = "1.1.4"

RPM_NAME = "pystring-devel-1.1.4-1.9.aarch64.rpm"
RPM_HASH = "46f0ef77dc9f8328f07088378270a96484f18c4fd2bd1efe8396a72e98d25e698fc1870ecbce45654d88e835d14e3b8b93a52772ea1a5a9c4e3ad210d57e7588"

RPROVIDES:${PN} += "pystring-devel"

RDEPENDS:${PN} += "libpystring0-0"

inherit rpm

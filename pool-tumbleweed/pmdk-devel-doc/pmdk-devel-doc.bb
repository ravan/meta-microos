SUMMARY = "Man pages for the libpmem C API"
DESCRIPTION = "Documentation for the pmem library interface."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "pmdk-devel-doc-2.1.1-1.5.noarch.rpm"
RPM_HASH = "0bc437757b9905221bad1aa295941d99b1744c504a35b14ff97448c521784221ebc2cfe0c858c00b1ac8f29ef89387a175013c156c32f6cd8912c66d9e2af95d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pmdk-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm

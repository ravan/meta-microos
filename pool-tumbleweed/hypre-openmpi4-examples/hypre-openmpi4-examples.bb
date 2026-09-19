SUMMARY = "Examples for Hypre"
DESCRIPTION = "This package contains examples for Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "3.1.0"

RPM_NAME = "hypre-openmpi4-examples-3.1.0-1.3.noarch.rpm"
RPM_HASH = "e6a5dc398960ec1bfad0c883c918f5aca58cd1a26e0e08bb295cb4ef323a6d70da5d421a0a7ad370dec4ac45120cb69658ceb16cd9ecb9e829af40bcc608ad53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-openmpi4-examples"

RDEPENDS:${PN} += ""

inherit rpm

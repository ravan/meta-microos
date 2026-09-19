SUMMARY = "Open Virtual Network Documentation"
DESCRIPTION = "Contains additional documentation for OVN."
LICENSE = "Apache-2.0"

PV = "26.03.2"

RPM_NAME = "ovn-doc-26.03.2-37.1.noarch.rpm"
RPM_HASH = "8ab0f928c90a60b86ac6cc06b1792cd18e4997dd62e1aac35cfb5b85b2fa08d565462a1c50652aca87e65384399fa851b50b4d81a0f74fd0c53b615fce980a9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ovn-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Development files for MistServer"
DESCRIPTION = "Development files for MistServer."
LICENSE = "Unlicense"

PV = "3.11.1"

RPM_NAME = "MistServer-devel-3.11.1-1.1.noarch.rpm"
RPM_HASH = "d95739103df8fc1e0d85ff604a4b9b3e565f2dfe8defd32d7ec451ab1401883035c4a9a02d3c9efc4d9bf34b283cdcd81f6506123506e1270c97bfa065366555"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "MistServer-devel"

RDEPENDS:${PN} += ""

inherit rpm

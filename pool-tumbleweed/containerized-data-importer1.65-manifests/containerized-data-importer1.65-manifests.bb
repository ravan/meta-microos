SUMMARY = "YAML manifests used to install CDI"
DESCRIPTION = "This contains the built YAML manifests used to install CDI into a \
kubernetes installation with kubectl apply."
LICENSE = "Apache-2.0"

PV = "1.65.0"

RPM_NAME = "containerized-data-importer1.65-manifests-1.65.0-3.1.aarch64.rpm"
RPM_HASH = "ce666257f72057c75fc84e78a7d455b7d49009869e2ea1580151028304c48323d0384194de0c1ba0688b1b681df504a574d95000050bbcc39330316f1c46250b"

RPROVIDES:${PN} += "containerized-data-importer-1.65-manifests \
containerized-data-importer-manifests \
containerized-data-importer1.65-manifests"

RDEPENDS:${PN} += ""

inherit rpm

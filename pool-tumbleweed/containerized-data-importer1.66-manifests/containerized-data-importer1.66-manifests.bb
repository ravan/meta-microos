SUMMARY = "YAML manifests used to install CDI"
DESCRIPTION = "This contains the built YAML manifests used to install CDI into a \
kubernetes installation with kubectl apply."
LICENSE = "Apache-2.0"

PV = "1.66.1"

RPM_NAME = "containerized-data-importer1.66-manifests-1.66.1-1.1.aarch64.rpm"
RPM_HASH = "b8c8453662f40b481fe28a5a92322e450e76721b95d15a15034a236c4b079fee7ca1866db86c6a99b0f5b8610c8132d261aac93131167e7a88d13278feb47253"

RPROVIDES:${PN} += "containerized-data-importer-manifests \
containerized-data-importer1.66-manifests"

RDEPENDS:${PN} += ""

inherit rpm

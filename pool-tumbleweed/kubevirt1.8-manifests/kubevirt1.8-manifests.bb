SUMMARY = "YAML manifests used to install kubevirt"
DESCRIPTION = "This contains the built YAML manifests used to install kubevirt into a \
kubernetes installation with kubectl apply."
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "kubevirt1.8-manifests-1.8.4-5.1.aarch64.rpm"
RPM_HASH = "65f56c33d68702d0056634ba1bfa443f384c18864b9bf75e4baa6182bd377a05d03c7624536e7fbf0cb3c09bf4fc46c541f978c8dfea5eb00f0da16edb2b18b3"

RPROVIDES:${PN} += "kubevirt-1.8-manifests \
kubevirt-manifests \
kubevirt1.8-manifests"

RDEPENDS:${PN} += ""

inherit rpm

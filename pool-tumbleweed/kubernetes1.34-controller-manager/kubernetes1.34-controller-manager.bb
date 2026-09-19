SUMMARY = "Kubernetes controller-manager for container image"
DESCRIPTION = "This subpackage contains the kube-controller-manager binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.34.11"

RPM_NAME = "kubernetes1.34-controller-manager-1.34.11-2.1.aarch64.rpm"
RPM_HASH = "d2dea763537787e4258dc734d35df3b8a505f6249e52a6c74991dbeece175479820dacc70f31978191e40ee82693ac10e84e5a30d0d3aafbb3d4ca6bafe4a7b4"

RPROVIDES:${PN} += "kubernetes-controller-manager-provider \
kubernetes1.34-controller-manager"

RDEPENDS:${PN} += ""

inherit rpm

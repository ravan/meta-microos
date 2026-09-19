SUMMARY = "Rook Ceph operator helm charts"
DESCRIPTION = "Helm helps manage Kubernetes applications. Helm Charts define, \
install, and upgrade Kubernetes applications. Rook is a \
cloud-native storage orchestrator for Kubernetes, providing \
the platform, framework, and support for a diverse set of storage \
solutions to integrate with cloud-native environments. \
 \
This package contains Helm Charts for Rook."
LICENSE = "Apache-2.0"

PV = "1.6.2+git0.ge8fd65f08"

RPM_NAME = "rook-ceph-helm-charts-1.6.2+git0.ge8fd65f08-3.16.noarch.rpm"
RPM_HASH = "290301d9e93b16fcf8badc49abe2a4447fb3b53c906ed1c9799f54b44fce66868c4d7b55957f0fbcc8d36b81f36b18a9f89a79977dd4c6ef0f0801b96fc08503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rook-ceph-helm-charts"

RDEPENDS:${PN} += ""

inherit rpm

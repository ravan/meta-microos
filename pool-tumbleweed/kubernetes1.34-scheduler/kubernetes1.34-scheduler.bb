SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.34.11"

RPM_NAME = "kubernetes1.34-scheduler-1.34.11-2.1.aarch64.rpm"
RPM_HASH = "f4e7ba64caddaea2bb93b84d0842d8419da9be2d32531642f902ae3b5d881a3061ba194f38d07a95ae4029708083fd5d1cf5cc1a715dea20cf6e968683fd43cb"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.34-scheduler"

RDEPENDS:${PN} += ""

inherit rpm

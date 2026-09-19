SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.37.0"

RPM_NAME = "kubernetes1.37-scheduler-1.37.0-1.1.aarch64.rpm"
RPM_HASH = "f449f3583dbb9404874fe90397a62ffcb59b3d896a6bf2aec21010f64d13dc6d655b5c249b96a9b603344048931bb77c3c98b0afa6612b09434d27320343ee18"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.37-scheduler"

RDEPENDS:${PN} += ""

inherit rpm

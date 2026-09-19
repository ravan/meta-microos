SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.36.4"

RPM_NAME = "kubernetes-scheduler-minus1-1.36.4-72.1.aarch64.rpm"
RPM_HASH = "cd96a2e352e3b6e825667b5d34c6a5fb543e7e031e1b1036ae39ccc6096fce70b8153f5cbea9318720dc8637d3ec36723b7fbdd0df71219bda331ef39a629475"

RPROVIDES:${PN} += "kubernetes-scheduler-minus1"

RDEPENDS:${PN} += "kubernetes1.36-scheduler"

inherit rpm

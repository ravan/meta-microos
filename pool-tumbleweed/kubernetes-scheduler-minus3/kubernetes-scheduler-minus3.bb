SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.34.11"

RPM_NAME = "kubernetes-scheduler-minus3-1.34.11-72.1.aarch64.rpm"
RPM_HASH = "8be94efd3a13efeb0b5abf275724bc002ceb2322f3d8c23df6e8b784ef3dd7f567e346fc7830a892efb279c7ea4ecc43c0409789a044edc672d412a57c3a389c"

RPROVIDES:${PN} += "kubernetes-scheduler-minus3"

RDEPENDS:${PN} += "kubernetes1.34-scheduler"

inherit rpm

SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.37.0"

RPM_NAME = "kubernetes-scheduler-1.37.0-72.1.aarch64.rpm"
RPM_HASH = "137c6ae417f2db440932b0db6bdcce9ad2e73586154342110704de3a53e7cfc48d401ffd70960cc1b46270300e12fcac551eceb1524ce19dd909387af473cb66"

RPROVIDES:${PN} += "kubernetes-scheduler"

RDEPENDS:${PN} += "kubernetes1.37-scheduler"

inherit rpm

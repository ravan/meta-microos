SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.36.4"

RPM_NAME = "kubernetes1.36-scheduler-1.36.4-2.1.aarch64.rpm"
RPM_HASH = "76fc7ddd2fee47741d8b4ad55158c87cfdc30906574873c09d65bd072b9e8f6961c7d2843fb1047adfe2562bcd7da9cc5b4177be00852fe251e6c1c526b6f905"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.36-scheduler"

RDEPENDS:${PN} += ""

inherit rpm

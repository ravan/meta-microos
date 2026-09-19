SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.35.8"

RPM_NAME = "kubernetes-scheduler-minus2-1.35.8-72.1.aarch64.rpm"
RPM_HASH = "9391a305898fe36e0a3592ed13bf683a25a3dd8b9177f8875fa7b1b90efeb30786295d5060b110fa544c17388960488da9e1a8b430a4222883d26e5c40155183"

RPROVIDES:${PN} += "kubernetes-scheduler-minus2"

RDEPENDS:${PN} += "kubernetes1.35-scheduler"

inherit rpm

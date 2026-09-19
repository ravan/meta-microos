SUMMARY = "Kubernetes scheduler for container image"
DESCRIPTION = "This subpackage contains the kube-scheduler binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.35.8"

RPM_NAME = "kubernetes1.35-scheduler-1.35.8-2.1.aarch64.rpm"
RPM_HASH = "c674801a5a955509454a3e250ad9097bc8051434e72c4f1b93df070fb735bb100cb883ae9360ec429efc6f08d92222268b0fc6fda0dbc6732810bbc2c8dcfa25"

RPROVIDES:${PN} += "kubernetes-scheduler-provider \
kubernetes1.35-scheduler"

RDEPENDS:${PN} += ""

inherit rpm

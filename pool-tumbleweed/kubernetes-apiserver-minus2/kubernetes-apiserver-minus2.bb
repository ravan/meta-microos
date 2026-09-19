SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.35.8"

RPM_NAME = "kubernetes-apiserver-minus2-1.35.8-72.1.aarch64.rpm"
RPM_HASH = "8b36490a364be581cdad3efef571b9c51955878e76d946d6729244eb98a0b1f6b6cab89a187e7928a3f4a73cd281645d3b7f5caae1360dacf46b8b61c05c5c98"

RPROVIDES:${PN} += "kubernetes-apiserver-minus2"

RDEPENDS:${PN} += "kubernetes1.35-apiserver"

inherit rpm

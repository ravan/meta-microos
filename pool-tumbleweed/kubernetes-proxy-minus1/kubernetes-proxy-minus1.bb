SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.36.4"

RPM_NAME = "kubernetes-proxy-minus1-1.36.4-72.1.aarch64.rpm"
RPM_HASH = "17ed288f168603e55647f3c148dfdc97ed88c6fb51d875baad2125717c4b5e2160241839f4c24790a3fa47b458b7bd5467fe3ef97bb6f6594bc8d292946f2565"

RPROVIDES:${PN} += "kubernetes-proxy-minus1"

RDEPENDS:${PN} += "kubernetes1.36-proxy"

inherit rpm

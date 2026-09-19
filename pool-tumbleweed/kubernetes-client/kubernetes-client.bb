SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.37.0"

RPM_NAME = "kubernetes-client-1.37.0-72.1.aarch64.rpm"
RPM_HASH = "5ab1d2445d6484f760c5c42f297614c727027420195dac62009b4724f9d67314b43564b9ba240e2d9d3e06e9b84cdc30138c27663fb5bfc538bc0293ad3c1032"

RPROVIDES:${PN} += "kubernetes-client"

RDEPENDS:${PN} += "kubernetes1.37-client"

inherit rpm

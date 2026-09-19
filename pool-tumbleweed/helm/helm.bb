SUMMARY = "The Kubernetes Package Manager"
DESCRIPTION = "Helm is a tool for managing Kubernetes charts. Charts are packages of \
pre-configured Kubernetes resources."
LICENSE = "Apache-2.0"

PV = "4.2.4"

RPM_NAME = "helm-4.2.4-3.1.aarch64.rpm"
RPM_HASH = "418975d0d5bfc29050dfbc015c349e802e9738e3a1628e459a2b53cf4ddee2204ec206f12bad4a1a17b53ab2e49b8e6ec05932de4f95de62fc4559690461e352"

RPROVIDES:${PN} += "helm"

RDEPENDS:${PN} += ""

inherit rpm

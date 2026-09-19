SUMMARY = "Security risk analysis for Kubernetes resources"
DESCRIPTION = "Security risk analysis for Kubernetes resources"
LICENSE = "Apache-2.0"

PV = "2.14.2"

RPM_NAME = "kubesec-2.14.2-1.11.aarch64.rpm"
RPM_HASH = "80845ace30421a3e2bca23057cdaf6af40e1df0557be6d3eb56a0c9ea0804bfa58901ade1b6c7282070e05b842a9a723ce5e620cb9d489370b9f85d42431bd44"

RPROVIDES:${PN} += "kubesec"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

SUMMARY = "Manage multiple versions of kubectl, helm and velero clients on same system/jumpbox/bastion"
DESCRIPTION = "Kubernetes client's version manager inspired by tfenv \
 \
Kubernetes clients supported at this moments are kubectl, or, helm, or, velero \
on Linux servers/machines. \
 \
Manytimes we need to manage many Kubernetes clusters from same jumpbox or \
machine or bastion server. Those many cluster may have different versions of \
Kubernetes. In that case, It becomes difficult to use multiple versions of \
Kubernetes clients to communicate with those different versions of clusters. \
 \
This small tool is to help manage different versions of Kubernetes clients. \
Kubernetes clients kubectl, helm and velero are supported at this stage."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "k8senv-1.1.1-1.12.aarch64.rpm"
RPM_HASH = "4369e33e1b1825f773dcd03ff1f10f0b00bad5bbd681dba6a3a87e0853368485c59f480d379ed9f16a25778bd9d07c1fca112468260c7e106fd2fefb45ec8240"

RPROVIDES:${PN} += "k8senv"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

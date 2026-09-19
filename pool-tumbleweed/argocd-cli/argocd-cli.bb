SUMMARY = "CLI for the ArgoCD declarative continuous deployment tool"
DESCRIPTION = "Argo CD is a declarative, GitOps continuous delivery tool for Kubernetes. \
 \
This packages contains the CLI to interact with the ArgoCD installation in a \
Kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "3.5.2"

RPM_NAME = "argocd-cli-3.5.2-1.1.aarch64.rpm"
RPM_HASH = "c03ae163f33be10f9b9f1328ccefc7eec3416bfd4886ad13e1bb7661a2e8025b22cb425858080cbd81bf23940579c67af85977ba9ab8f7a21858324dfb9096d3"

RPROVIDES:${PN} += "argocd-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

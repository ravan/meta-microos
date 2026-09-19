SUMMARY = "Kubectl plugin for local validation of resources"
DESCRIPTION = "kubectl-validate is a SIG-CLI subproject to support the local validation of \
resources for native Kubernetes types and CRDs. \
 \
This project has two goals: \
 \
1. Shift-left validation of resources with as close to parity to server-side \
   Kubernetes as possible. \
2) Improve declarative validation support in upstream Kubernetes over time, \
   making those improvements available for kubectl-validate users early."
LICENSE = "Apache-2.0"

PV = "0.0.4"

RPM_NAME = "kubectl-validate-0.0.4-3.5.aarch64.rpm"
RPM_HASH = "eba10ce4a2b89cda4cda624b6f958954fa16683ee8b726c12711d261ff1fa35a9cfe88bad4b164545b026e7d5ab74afc84f07cb7757b50864b17319613e6b6b7"

RPROVIDES:${PN} += "kubectl-validate"

RDEPENDS:${PN} += ""

inherit rpm

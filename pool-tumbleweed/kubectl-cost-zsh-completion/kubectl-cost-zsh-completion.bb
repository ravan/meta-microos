SUMMARY = "Zsh Completion for kubectl-cost"
DESCRIPTION = "zsh command line completion support for kubectl-cost."
LICENSE = "Apache-2.0"

PV = "0.6.6"

RPM_NAME = "kubectl-cost-zsh-completion-0.6.6-1.13.noarch.rpm"
RPM_HASH = "8b04e8c7ff01f95b7e4ffea73d66be618b881b9218b83d59283742de140b339fbfbef77a2188174b6742289299928f7145cddc2517c91dc417ed7dc9336f580b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectl-cost-zsh-completion"

RDEPENDS:${PN} += "kubectl-cost"

inherit rpm

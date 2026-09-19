SUMMARY = "Bash Completion for kubectl-cost"
DESCRIPTION = "Bash command line completion support for kubectl-cost."
LICENSE = "Apache-2.0"

PV = "0.6.6"

RPM_NAME = "kubectl-cost-bash-completion-0.6.6-1.13.noarch.rpm"
RPM_HASH = "fa48f39f70a12e9328bd537730781c8be73aa54b121c481be6447a8e2611031607d2ce7ce13a11689fa3d662d8b64a566df234169418b6f3764455c862a79152"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectl-cost-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubectl-cost"

inherit rpm

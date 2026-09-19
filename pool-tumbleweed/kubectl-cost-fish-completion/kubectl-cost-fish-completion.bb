SUMMARY = "Fish Completion for kubectl-cost"
DESCRIPTION = "Fish command line completion support for kubectl-cost."
LICENSE = "Apache-2.0"

PV = "0.6.6"

RPM_NAME = "kubectl-cost-fish-completion-0.6.6-1.13.noarch.rpm"
RPM_HASH = "1943309aa2f284356b7e003f5c72b3b477385d04d905458dc45fc7d9759be611f2cf6fcc2ffa585461a48d8df71790b45b93eb3fd626037c274b8e020719be15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectl-cost-fish-completion"

RDEPENDS:${PN} += "kubectl-cost"

inherit rpm

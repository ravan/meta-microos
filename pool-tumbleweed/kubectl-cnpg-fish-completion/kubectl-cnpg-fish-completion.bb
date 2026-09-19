SUMMARY = "Fish Completion for kubectl-cnpg"
DESCRIPTION = "Fish command line completion support for kubectl-cnpg."
LICENSE = "Apache-2.0"

PV = "1.29.2"

RPM_NAME = "kubectl-cnpg-fish-completion-1.29.2-1.3.noarch.rpm"
RPM_HASH = "e6464a5495d7e74406c1fbbe63a62a49415db685f6f2218e44a641b7cc4254b73cf4a16516e23dae547c1e5e79a8799b2ed49d664088f602ab1eb37c8ab35d75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectl-cnpg-fish-completion"

RDEPENDS:${PN} += "kubectl-cnpg"

inherit rpm

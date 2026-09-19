SUMMARY = "Fish Completion for kargo-cli"
DESCRIPTION = "Fish command line completion support for kargo-cli."
LICENSE = "Apache-2.0"

PV = "1.11.2"

RPM_NAME = "kargo-cli-fish-completion-1.11.2-1.1.noarch.rpm"
RPM_HASH = "f114855a90387dea3051b6ad4d717168c8ce00e6681011a123d97a9ef4c022a54952518597716c08fe55003eb9f07e7134538e8b69d4561e87a4ff906ccf4786"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kargo-cli-fish-completion"

RDEPENDS:${PN} += "kargo-cli"

inherit rpm

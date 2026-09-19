SUMMARY = "Bash completion for rbenv"
DESCRIPTION = "The official bash completion script for rbenv."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "rbenv-bash-completion-1.3.2-1.6.noarch.rpm"
RPM_HASH = "970ee53d98df99f0c1baa7bf205a433526ce9493897b674fbca244f69087649f37fe3c74ba53ad794f092e68212f33e7e663e04ac2850e3191e28f95251ab925"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rbenv-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm

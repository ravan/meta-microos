SUMMARY = "Zsh Completion for kubectl-switch"
DESCRIPTION = "zsh command line completion support for kubectl-switch."
LICENSE = "MIT"

PV = "2.4.32"

RPM_NAME = "kubectl-switch-zsh-completion-2.4.32-1.1.noarch.rpm"
RPM_HASH = "78e791ae7f03cb15c954e32030c8912b39084746531dea64e0becc4656221a82b9bb79dbe4d7d8598563570f95734271ea36ec975cd81bc2933b90ecaa929598"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectl-switch-zsh-completion"

RDEPENDS:${PN} += "kubectl-switch \
zsh"

inherit rpm

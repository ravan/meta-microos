SUMMARY = "Zsh Completion for argocd-autopilot"
DESCRIPTION = "zsh command line completion support for argocd-autopilot."
LICENSE = "Apache-2.0"

PV = "0.4.20"

RPM_NAME = "argocd-autopilot-zsh-completion-0.4.20-1.8.noarch.rpm"
RPM_HASH = "e3b339d104285d2f219d5bc6677f372928d35c05bfbcd299fc4c925bb9b6302a90e0a3a6c30fa7e3eafdbdf4e140a7e0b56ac55c4c0ca16176faad7df42d257c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "argocd-autopilot-zsh-completion"

RDEPENDS:${PN} += "argocd-autopilot"

inherit rpm

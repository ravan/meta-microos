SUMMARY = "Bash Completion for argocd-autopilot"
DESCRIPTION = "Bash command line completion support for argocd-autopilot."
LICENSE = "Apache-2.0"

PV = "0.4.20"

RPM_NAME = "argocd-autopilot-bash-completion-0.4.20-1.8.noarch.rpm"
RPM_HASH = "ae8eb4392897ec099885b651cf196c60d6a569fad5e87b782311c2b606e86c329d6cc26832b1726aa2935ffcbba8e4d702fcc5ab89e8ea64c7b2966ea838e327"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "argocd-autopilot-bash-completion"

RDEPENDS:${PN} += "argocd-autopilot \
bash-completion"

inherit rpm

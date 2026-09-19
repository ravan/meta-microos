SUMMARY = "Fish Completion for argocd-autopilot"
DESCRIPTION = "Fish command line completion support for argocd-autopilot."
LICENSE = "Apache-2.0"

PV = "0.4.20"

RPM_NAME = "argocd-autopilot-fish-completion-0.4.20-1.8.noarch.rpm"
RPM_HASH = "a3b8b36773939597263fa199e91f9120f9343564166184887f7be2295c89d25aa70d74d65ed831fda5ca99244c6a0b4949f7862dca6acd4b70ce8cb45ccc8ab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "argocd-autopilot-fish-completion"

RDEPENDS:${PN} += "argocd-autopilot"

inherit rpm

SUMMARY = "Zsh Completion for prek"
DESCRIPTION = "zsh command line completion support for prek."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "prek-zsh-completion-0.5.0-1.1.noarch.rpm"
RPM_HASH = "92591c2682ffbe6dc2514671b349690f6e12e7d721b7ad06985ee01da173d98577a45fb39e0cdae65a05078a09ed4a7981eab4c32f141ee26c7625ea0479df17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "prek-zsh-completion"

RDEPENDS:${PN} += "prek \
zsh"

inherit rpm

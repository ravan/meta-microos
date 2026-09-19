SUMMARY = "Zsh Completion for kubectl-klock"
DESCRIPTION = "zsh command line completion support for kubectl-klock."
LICENSE = "Apache-2.0 & GPL-3.0-or-later & CC-BY-4.0 & CC0-1.0"

PV = "0.9.2"

RPM_NAME = "kubectl-klock-zsh-completion-0.9.2-1.1.noarch.rpm"
RPM_HASH = "fb6c018ecd5065515a3b02bdfa461c826d2fc935bb4299979ce7b3a0f0bba0cb5ab0711563b4b7fc57fa47d562221b70c5a2556f68d403c76c4ef1616e606350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectl-klock-zsh-completion"

RDEPENDS:${PN} += "kubectl-klock \
zsh"

inherit rpm

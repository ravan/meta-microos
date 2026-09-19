SUMMARY = "Zsh Completion for gitleaks"
DESCRIPTION = "zsh command line completion support for gitleaks."
LICENSE = "MIT"

PV = "8.30.1"

RPM_NAME = "gitleaks-zsh-completion-8.30.1-1.4.noarch.rpm"
RPM_HASH = "a567be38954b0955569879f81a01dc47693e7db44325ff5294e208d951c5fde162f789a2f577bdef4d1a7f3d2aab09c65450fbbe2d655100b23c088694bf091c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gitleaks-zsh-completion"

RDEPENDS:${PN} += "gitleaks"

inherit rpm

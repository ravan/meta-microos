SUMMARY = "Zsh Completion for chainguard-dfc"
DESCRIPTION = "zsh command line completion support for chainguard-dfc."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "chainguard-dfc-zsh-completion-0.10.0-1.7.noarch.rpm"
RPM_HASH = "0593adc39de01e06d1e92e24a42b1411007dfd79e7c100839935c048d70156ae58462561c940bed28b0bfe3940365970e39e497a0f62c55933bf9bd617a7f721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chainguard-dfc-zsh-completion"

RDEPENDS:${PN} += "chainguard-dfc \
zsh"

inherit rpm

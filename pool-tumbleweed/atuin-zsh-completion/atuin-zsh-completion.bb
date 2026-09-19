SUMMARY = "Zsh completion for atuin"
DESCRIPTION = "Zsh command line completion support for atuin."
LICENSE = "MIT"

PV = "18.22.0"

RPM_NAME = "atuin-zsh-completion-18.22.0-1.1.noarch.rpm"
RPM_HASH = "1a38df5aa74c05a6a6aee2f5c3bd9d3bdc490f3dc9036ec42b1e760b8e2b699811f0a61c14e552cb137e7844055f139f775c4f8f488ccd930c3823fae9b8c690"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atuin-zsh-completion"

RDEPENDS:${PN} += "atuin"

inherit rpm

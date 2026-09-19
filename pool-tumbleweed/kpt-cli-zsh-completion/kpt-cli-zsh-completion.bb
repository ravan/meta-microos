SUMMARY = "Zsh Completion for kpt-cli"
DESCRIPTION = "zsh command line completion support for kpt-cli."
LICENSE = "Apache-2.0"

PV = "1.0.0~beta.67"

RPM_NAME = "kpt-cli-zsh-completion-1.0.0~beta.67-1.2.noarch.rpm"
RPM_HASH = "5814ed7ee7e19e80f4d76c65c9ba28ece7bccd188fb349ecf4a1b5ebb047cb7d17c35bd36ce6cd495c0025e296ee26d0e11fbf77c1d3af39d1cd36582074308e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kpt-cli-zsh-completion"

RDEPENDS:${PN} += "kpt-cli"

inherit rpm

SUMMARY = "Zsh Completion for zli"
DESCRIPTION = "zsh command line completion support for zli."
LICENSE = "Apache-2.0"

PV = "2.1.20"

RPM_NAME = "zli-zsh-completion-2.1.20-1.2.noarch.rpm"
RPM_HASH = "3092c829f28517b056cbb43340605c50b5d5fd7b25a4cd706ffda44ffbe1bd841cdd71b11d7dab7e32f5394de9dd4f01dd2d090de5234c6b6ebdedafa81f2059"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zli-zsh-completion"

RDEPENDS:${PN} += "zli \
zsh"

inherit rpm

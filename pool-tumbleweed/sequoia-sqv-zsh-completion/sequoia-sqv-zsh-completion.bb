SUMMARY = "Zsh completion for sequoia-sqv"
DESCRIPTION = "Zsh command line completion support for sequoia-sqv."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "sequoia-sqv-zsh-completion-1.3.0-2.3.noarch.rpm"
RPM_HASH = "b2d90ab86d2259654e20a659c60cd0af1c16111a3de62b6781d279e5e8570de9d57bc8b89a269d9e7d39518e89e09a1f9e7925ae18fbf51f23415a94ad494033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sequoia-sqv-zsh-completion"

RDEPENDS:${PN} += "sequoia-sqv"

inherit rpm

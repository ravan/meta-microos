SUMMARY = "Zsh Completion for timoni"
DESCRIPTION = "zsh command line completion support for timoni."
LICENSE = "Apache-2.0"

PV = "0.33.0"

RPM_NAME = "timoni-zsh-completion-0.33.0-1.1.noarch.rpm"
RPM_HASH = "c2d0c1bf63225597cdac3c4dc8d92545954c8fbc47661f315fca28dc1cc5cf3227a3b86982310dfd02f697ab00d11ad7b5a17771a47872daa353486e092c4d00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "timoni-zsh-completion"

RDEPENDS:${PN} += "timoni"

inherit rpm

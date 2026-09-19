SUMMARY = "Zsh completion for nvimpager"
DESCRIPTION = "Zsh command line completion support for nvimpager."
LICENSE = "BSD-2-Clause"

PV = "0.14.0"

RPM_NAME = "nvimpager-zsh-completion-0.14.0-1.3.noarch.rpm"
RPM_HASH = "cd17d922bf38d5df28f009201fcf9a21d9e9e6a56982be53923dee503092e2c90149a69a23a19ae11394d57eb4c24e315a55756c3715c8c69915ab12ffd6c2b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvimpager-zsh-completion"

RDEPENDS:${PN} += "nvimpager \
zsh"

inherit rpm

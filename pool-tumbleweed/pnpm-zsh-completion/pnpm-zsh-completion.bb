SUMMARY = "Zsh completion for pnpm"
DESCRIPTION = "Zsh command line completion support for pnpm."
LICENSE = "MIT"

PV = "11.9.0"

RPM_NAME = "pnpm-zsh-completion-11.9.0-1.1.noarch.rpm"
RPM_HASH = "6e2566beaa9d90b231d39a7f6102bedf6cbaadf36e8f59f6774884f50fd8f579609e23aadb7718b0fe65c2f21afc1e04f93a32224a6373d742bdca67666796d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnpm-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm

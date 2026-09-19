SUMMARY = "ZSH Completion for gh"
DESCRIPTION = "ZSH command line completion support for gh."
LICENSE = "MIT"

PV = "2.100.0"

RPM_NAME = "gh-zsh-completion-2.100.0-1.1.noarch.rpm"
RPM_HASH = "c71f65c2403a486a46ea1d92f4de164f0fff4da3e617e45861b76375f3c7e14494f1727c44ea5666f30b7258209fdb1e1b2679bf23b6edaa3243016ca54d0235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gh-zsh-completion"

RDEPENDS:${PN} += "gh"

inherit rpm

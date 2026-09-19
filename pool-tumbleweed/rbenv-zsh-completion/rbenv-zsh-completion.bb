SUMMARY = "ZSH completion for rbenv"
DESCRIPTION = "The official zsh completion script for rbenv."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "rbenv-zsh-completion-1.3.2-1.6.noarch.rpm"
RPM_HASH = "2e4e3eefb9e8efbb7f58bb30637f685c0951ad6733af16ea96f9ab01bee9a6e5fc299edae221c9cf3e65c486d289079fc5f5d9829fdbaedaf5efbef71e3b8409"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rbenv-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm

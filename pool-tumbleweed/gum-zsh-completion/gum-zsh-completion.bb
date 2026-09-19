SUMMARY = "Zsh Completion for gum"
DESCRIPTION = "Zsh command-line completion support for gum."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "gum-zsh-completion-0.16.0-1.8.noarch.rpm"
RPM_HASH = "1423912d0660339c60399fe20f23c4df7785eb4c296d0a1cd73b8ec04c9c07dd061f127b4f90ebd456575d80896ea44fada5ff92b565c7b1f7a2c597ab7f0dd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gum-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm

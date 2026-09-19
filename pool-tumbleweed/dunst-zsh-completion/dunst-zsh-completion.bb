SUMMARY = "ZSH Completion for dunst"
DESCRIPTION = "The official zsh completion script for dunst, generated during the build."
LICENSE = "BSD-3-Clause"

PV = "1.13.2"

RPM_NAME = "dunst-zsh-completion-1.13.2-1.3.noarch.rpm"
RPM_HASH = "6c77b02a52c99d0b0cf6f5677c926abf56db3e4d1791b3c7dd9b1cf6ffc14f6987fe00bc81a20066739d1177d3006da466d045426680938fb5876e4cfbda9c26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dunst-zsh-completion"

RDEPENDS:${PN} += "dunst"

inherit rpm

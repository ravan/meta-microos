SUMMARY = "ZSH Completion for tlp-rdw"
DESCRIPTION = "The official zsh completion script for tlp-rdw."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.10.2"

RPM_NAME = "tlp-rdw-zsh-completion-1.10.2-1.1.noarch.rpm"
RPM_HASH = "a3394ae5876dd665b1c9372c65332b6b84dc911348558ed4f9943226e125443a8038a077f99b8fbd646df7c3ee4b0928d9e405a5b78bf344777954c6d6bf705c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tlp-rdw-zsh-completion"

RDEPENDS:${PN} += "tlp-rdw"

inherit rpm

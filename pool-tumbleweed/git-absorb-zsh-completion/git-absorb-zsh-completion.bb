SUMMARY = "ZSH Completion for git-absorb"
DESCRIPTION = "The official zsh completion script for git-absorb, generated during the build."
LICENSE = "BSD-3-Clause"

PV = "0.6.17"

RPM_NAME = "git-absorb-zsh-completion-0.6.17-1.9.noarch.rpm"
RPM_HASH = "f36c59eb793272d9c6837e661c55c25175cdb1901ebc4965ed698b82ce7492a48ad97dd206f9199a2ea81ef44c12cefd41c66e1ca939758fb0cabcb033e6c6a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-absorb-zsh-completion"

RDEPENDS:${PN} += "git-absorb"

inherit rpm

SUMMARY = "ZSH Completion for fclones"
DESCRIPTION = "The official zsh completion script for fclones, generated during the build."
LICENSE = "MIT"

PV = "0.35.0"

RPM_NAME = "fclones-zsh-completion-0.35.0-2.5.noarch.rpm"
RPM_HASH = "29aacabd8c3e650676b3bd1a07f2ddd0d14696a6276f98fcfe2321e717a3d1591dd6363f51787542578731fc2a0ad669b11c5cb1b9227e083c555aaba355e02a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fclones-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm

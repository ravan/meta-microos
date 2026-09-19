SUMMARY = "ZSH Completion for alacritty"
DESCRIPTION = "The official zsh completion script for alacritty."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "alacritty-zsh-completion-0.17.0-1.5.noarch.rpm"
RPM_HASH = "ea0ba5fbc497d5fee8a600d24e7bd840fd6ce1f8824aeb5628f9e51d502017810178fa607e196d41238b1028b911511780aceb335168b4eadeb7751dd2f6254f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alacritty-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm

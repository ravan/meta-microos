SUMMARY = "ZSH Completion for scrot"
DESCRIPTION = "The official zsh completion script for scrot"
LICENSE = "SUSE-Scrot"

PV = "1.12.1"

RPM_NAME = "scrot-zsh-completion-1.12.1-2.4.noarch.rpm"
RPM_HASH = "a12ae2d738e8b17c37cbe68565d8d92720ca1a89b95240a463b7e75c96adb7b10a6150181544ba547b978750a1d2668f23db3aef62ffb821d65c2a5cdd9be0b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scrot-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm

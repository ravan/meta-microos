SUMMARY = "ZSH Completion for tlpctl"
DESCRIPTION = "The official zsh completion script for tlpctl."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.10.2"

RPM_NAME = "tlpctl-zsh-completion-1.10.2-1.1.noarch.rpm"
RPM_HASH = "16d0f944f99e82c4b05b66c642b4478b1ab89166a9d65a4c355c596b1b4c21ff4805fe458e525a18b90115fe65efb3388fcaa81dd3d9a502106815650bb82b6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tlpctl-zsh-completion"

RDEPENDS:${PN} += "tlp-pd"

inherit rpm

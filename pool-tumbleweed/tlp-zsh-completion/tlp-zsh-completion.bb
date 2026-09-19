SUMMARY = "ZSH Completion for tlp"
DESCRIPTION = "The official zsh completion script for tlp."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.10.2"

RPM_NAME = "tlp-zsh-completion-1.10.2-1.1.noarch.rpm"
RPM_HASH = "6fd65e0f45d93811b9cb86a0c537b848d30e2e130ef90e8ebb260e31509709ee1295e8367e21d394ca3f9fd55ba12fdd62090c80f747355defe2f662996a1baf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tlp-zsh-completion"

RDEPENDS:${PN} += "tlp"

inherit rpm

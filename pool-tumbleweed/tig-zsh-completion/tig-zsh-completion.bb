SUMMARY = "Zsh completion for tig"
DESCRIPTION = "Zsh command line completion support for tig."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.1"

RPM_NAME = "tig-zsh-completion-2.6.1-1.3.noarch.rpm"
RPM_HASH = "178d923ac94cc4bed906738df322e79c25bbfadfab1b6ad919054d1baa49824fee763bc8ce574359a19919030950c6fc206c125ad5ebf56869dae6c88e7cdc11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tig-zsh-completion"

RDEPENDS:${PN} += "tig \
zsh"

inherit rpm

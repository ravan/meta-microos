SUMMARY = "Fish Completion for pueue"
DESCRIPTION = "The official zsh completion script for pueue."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "pueue-zsh-completion-3.4.1-1.12.noarch.rpm"
RPM_HASH = "c23320fbaf0a2b2e887df5df05b3589944c40111ee280671f348cb47866cc63a0e83e6dfe32d8bb7a0cc1eb7aad018c730a5eda18c927ad60f2ff761525ec9b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pueue-zsh-completion"

RDEPENDS:${PN} += "pueue"

inherit rpm

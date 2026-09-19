SUMMARY = "Zsh completion for lastpass-cli"
DESCRIPTION = "The zsh completion script for the lpass command."
LICENSE = "GPL-2.0-only"

PV = "1.6.1"

RPM_NAME = "lastpass-cli-zsh-completion-1.6.1-1.1.noarch.rpm"
RPM_HASH = "03b73f8cc272810ad97fb49a1d6ba6376a63c324af6e8487f65fca848b6606191d4a5c847d27098b71ca547d0dcdb7669719c4c53aa588a02b32b3e677beeaf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lastpass-cli-zsh-completion"

RDEPENDS:${PN} += "lastpass-cli"

inherit rpm

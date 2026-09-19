SUMMARY = "Zsh Completion for opa"
DESCRIPTION = "zsh command line completion support for opa."
LICENSE = "Apache-2.0"

PV = "1.20.1"

RPM_NAME = "opa-zsh-completion-1.20.1-1.1.noarch.rpm"
RPM_HASH = "e0dced1f6cc66ea3377daf7300ac4951659ca6cd77954ee22e3794f08bee1bb19733899f807a33ba982dd52d681b56f9a34020730bfe92843e9a988658c1955a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opa-zsh-completion"

RDEPENDS:${PN} += "opa \
zsh"

inherit rpm

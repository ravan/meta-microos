SUMMARY = "ZSH Completion for go-passbolt-cli"
DESCRIPTION = "The official zsh completion script for go-passbolt-cli, generated during the build."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "go-passbolt-cli-zsh-completion-0.5.1-1.2.noarch.rpm"
RPM_HASH = "f11f12f5e49959f813e0a9eec59ed7ff81882423e92c182ee3108736538eb1f6ef801c9440deabba848fb0bf8248896b9b643cc9b40531c58ecac5afde62de31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "go-passbolt-cli-zsh-completion"

RDEPENDS:${PN} += "go-passbolt-cli"

inherit rpm

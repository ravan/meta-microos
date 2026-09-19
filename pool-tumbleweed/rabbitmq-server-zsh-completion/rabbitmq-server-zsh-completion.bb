SUMMARY = "Zsh completion for rabbitmq-server"
DESCRIPTION = "Optional dependency offering zsh completion for rabbitmq-server."
LICENSE = "MPL-2.0"

PV = "4.2.9"

RPM_NAME = "rabbitmq-server-zsh-completion-4.2.9-1.1.noarch.rpm"
RPM_HASH = "4ad037590ad373e9cf083f1f76958b31181e4fe39c40060f30f52615680ba7bb1bfce4614198259678d4f4585abdb7211531e6a1b384b50670037adbed5869fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rabbitmq-server-zsh-completion"

RDEPENDS:${PN} += "rabbitmq-server \
zsh"

inherit rpm

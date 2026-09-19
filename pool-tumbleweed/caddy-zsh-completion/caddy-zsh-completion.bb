SUMMARY = "ZSH Completion for caddy"
DESCRIPTION = "ZSH completion script for caddy, generated during the build."
LICENSE = "Apache-2.0"

PV = "2.11.4"

RPM_NAME = "caddy-zsh-completion-2.11.4-1.3.noarch.rpm"
RPM_HASH = "ebd7849d92e5d5158f4344d09e680366cb5d47e726e608436de6237526fa33cb0476079a70c3afbca6d827bba45694821287c5e3ed0a54314c6d030590b8cda4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caddy-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm

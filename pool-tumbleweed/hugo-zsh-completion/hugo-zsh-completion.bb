SUMMARY = "ZSH Completion for hugo"
DESCRIPTION = "The official zsh completion script for hugo, generated during the build."
LICENSE = "Apache-2.0 & MPL-2.0"

PV = "0.166.0"

RPM_NAME = "hugo-zsh-completion-0.166.0-1.1.noarch.rpm"
RPM_HASH = "087cbfe4f16f7907d19187b080b00dbb59216c7e3eaf2115bfe3322256b3e64e7f5ca4bc4375651fa1a08f69d6de1cb10972ff314c14ead38057337fa1432dd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hugo-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm

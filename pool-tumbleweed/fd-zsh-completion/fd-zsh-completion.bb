SUMMARY = "ZSH Completion for fd"
DESCRIPTION = "The official zsh completion script for fd, generated during the build."
LICENSE = "Apache-2.0 & MIT"

PV = "10.4.2"

RPM_NAME = "fd-zsh-completion-10.4.2-1.5.noarch.rpm"
RPM_HASH = "b30b6a5b6e80772dd5e3c6b6100a317bfef95f75fec5c246011c3b89c9f85c93a8a1c0de01382e7538ee3b7525e84746dcc03e8787be904746306531a331a45d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fd-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm

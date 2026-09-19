SUMMARY = "Zsh Completion for linkerd-cli"
DESCRIPTION = "zsh command line completion support for linkerd-cli."
LICENSE = "Apache-2.0"

PV = "2.20"

RPM_NAME = "linkerd-cli-zsh-completion-2.20-1.3.noarch.rpm"
RPM_HASH = "0373fd66f7a49abf7cb663fc83a21904f4ba392e00d46dee6f4c9c39dacd5bd1eb1c4b4d1f7cf25e00eeb550cdb9670dc820446a5b3811f95b28d9e61f178bfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "linkerd-cli-zsh-completion"

RDEPENDS:${PN} += "linkerd-cli"

inherit rpm

SUMMARY = "Zsh Completion for cilium-cli"
DESCRIPTION = "zsh command line completion support for cilium-cli."
LICENSE = "Apache-2.0"

PV = "0.19.7"

RPM_NAME = "cilium-cli-zsh-completion-0.19.7-1.1.noarch.rpm"
RPM_HASH = "a484e811bb3b1c3514988958a1f3b76ff79d398371e8feba2f650778b1a844f356d5fb5472c2960423ef2b1a0c42d8293336389c1a36be391f6edb9cdbd6c3dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cilium-cli-zsh-completion"

RDEPENDS:${PN} += "cilium-cli"

inherit rpm

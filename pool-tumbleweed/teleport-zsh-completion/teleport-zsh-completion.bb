SUMMARY = "Zsh Completion for teleport"
DESCRIPTION = "zsh command line completion support for teleport."
LICENSE = "AGPL-3.0-only"

PV = "17.7.26"

RPM_NAME = "teleport-zsh-completion-17.7.26-1.4.noarch.rpm"
RPM_HASH = "9e881bd3c6816364f5d00891962898672ff3e267ec2a1ad4b815388d3def68bbca62dd74af36e8b6b76edf72bdef7b8098164e6e8a49f6d039ad049bb33b4830"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "teleport-zsh-completion"

RDEPENDS:${PN} += "teleport"

inherit rpm

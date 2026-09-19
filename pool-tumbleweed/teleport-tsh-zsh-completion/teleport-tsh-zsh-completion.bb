SUMMARY = "Zsh Completion for teleport-tsh"
DESCRIPTION = "zsh command line completion support for teleport-tsh."
LICENSE = "AGPL-3.0-only"

PV = "17.7.26"

RPM_NAME = "teleport-tsh-zsh-completion-17.7.26-1.4.noarch.rpm"
RPM_HASH = "338393e18dda695de06df83ec4e512f1fb1be138ef96e9d59a1fad64b72101c5ecaab300afaa6c2b9ca2b4a53442ba42b9daa58c1a75c3206f9da0b946f44a60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "teleport-tsh-zsh-completion"

RDEPENDS:${PN} += "teleport-tsh"

inherit rpm

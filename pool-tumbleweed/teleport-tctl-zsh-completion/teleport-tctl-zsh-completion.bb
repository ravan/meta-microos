SUMMARY = "Zsh Completion for teleport-tctl"
DESCRIPTION = "zsh command line completion support for teleport-tctl."
LICENSE = "AGPL-3.0-only"

PV = "17.7.26"

RPM_NAME = "teleport-tctl-zsh-completion-17.7.26-1.4.noarch.rpm"
RPM_HASH = "d9223074a583a2360776e6bf887d5d7b69e1a731ad2b7b0d8157e4130114f25834192f3d3dff37c5f64de0975d4aa1503c2cbc306d64f7c1f6051f3c52def7c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "teleport-tctl-zsh-completion"

RDEPENDS:${PN} += "teleport-tctl"

inherit rpm

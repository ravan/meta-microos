SUMMARY = "Zsh Completion for glow"
DESCRIPTION = "Zsh command-line completion support for glow."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "glow-zsh-completion-3.0.0-1.1.noarch.rpm"
RPM_HASH = "88f787be892f3ad07c521123054a12f9436590e2ebf212d7a964007fbf6bb519e411a948d3768d7cc5cc805934f2e390adc6db37eef62da90f291f69a4da8b22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glow-zsh-completion"

RDEPENDS:${PN} += "glow \
zsh"

inherit rpm

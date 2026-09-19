SUMMARY = "Zsh Completion for lf"
DESCRIPTION = "Zsh command-line completion support for lf."
LICENSE = "MIT"

PV = "34"

RPM_NAME = "lf-zsh-completion-34-1.10.noarch.rpm"
RPM_HASH = "9430b217fea9471345d390963e56329c1738d0a4309d78caad5689df1648196bed67227527a2e58964313f826c5192a6c74d086074cfafd212c2f8ac4e106d95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lf-zsh-completion"

RDEPENDS:${PN} += "lf \
zsh"

inherit rpm

SUMMARY = "Zsh Completion for skupper"
DESCRIPTION = "zsh command line completion support for skupper."
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "skupper-zsh-completion-2.2.1-1.3.noarch.rpm"
RPM_HASH = "cb555351cac0bc657d3569cc0fb3cc88c23b2f2ad708258483ff17e9562551cef3e5c72983a7978eb77c8410af1135436ff6a1c43e01ac7f2979f04edad00a3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skupper-zsh-completion"

RDEPENDS:${PN} += "skupper \
zsh"

inherit rpm

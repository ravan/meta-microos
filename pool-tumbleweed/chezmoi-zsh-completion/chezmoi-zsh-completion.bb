SUMMARY = "Zsh completion for chezmoi"
DESCRIPTION = "Zsh command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.72.1"

RPM_NAME = "chezmoi-zsh-completion-2.72.1-1.1.noarch.rpm"
RPM_HASH = "78c887e0eb560c203ab25350a774e070513e7f5326ef71154a7b456616586bf5be40315c00dbf2ceecf1b453f610ce2d8de006adbc26c902afe5da32d6f61ab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-zsh-completion"

RDEPENDS:${PN} += "chezmoi"

inherit rpm

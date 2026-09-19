SUMMARY = "Zsh completion for swaylock"
DESCRIPTION = "Zsh command line completion support for swaylock."
LICENSE = "MIT"

PV = "1.8.6"

RPM_NAME = "swaylock-zsh-completion-1.8.6-1.2.noarch.rpm"
RPM_HASH = "7a558147bcb13bcdedd49ec4f3250a241567b3d665492be70de1a5dfcc87ab7d94314c0d7a06a0fe9d8c17fb4ef5ff3199c2e5997e089362bb0c87beb5cfd7f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swaylock-zsh-completion"

RDEPENDS:${PN} += "swaylock"

inherit rpm

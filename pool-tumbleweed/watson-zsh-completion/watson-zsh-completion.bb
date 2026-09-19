SUMMARY = "Zsh completion for watson"
DESCRIPTION = "Zsh command line completion support for watson."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "watson-zsh-completion-2.1.0-1.15.noarch.rpm"
RPM_HASH = "71fa8d05706eb834ec210f65bfc344f6181bfc9542e1c732fb078baba8805f8865f6ace0bcdfbc4abd148a5cd8d64a151a546076da2fac16213ce7f4061459d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "watson-zsh-completion"

RDEPENDS:${PN} += "watson"

inherit rpm

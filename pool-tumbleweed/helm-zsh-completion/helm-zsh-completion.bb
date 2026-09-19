SUMMARY = "Zsh Completion for helm"
DESCRIPTION = "Zsh command line completion support for helm."
LICENSE = "Apache-2.0"

PV = "4.2.4"

RPM_NAME = "helm-zsh-completion-4.2.4-3.1.noarch.rpm"
RPM_HASH = "947e061a192bddac41952653cb8b889d382620d97c85ba6f1e3ed117821d4da357122d93a3571c1ea8aa76b6c645927705be278236bec104ef7057f9cceb3c5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helm-zsh-completion"

RDEPENDS:${PN} += "helm \
zsh"

inherit rpm

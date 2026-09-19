SUMMARY = "Zsh Completion for curl"
DESCRIPTION = "ZSH command line completion support for curl."
LICENSE = "curl"

PV = "8.22.0"

RPM_NAME = "curl-zsh-completion-8.22.0-1.1.noarch.rpm"
RPM_HASH = "48713a60d4f01bb08eefeb9d135aaaff40bdd968f2efd70fe150303736d2498ed01b41117993c766e4b48abe9e59b7713e8b458654b4f524656a51ac06ed8db2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "curl-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm

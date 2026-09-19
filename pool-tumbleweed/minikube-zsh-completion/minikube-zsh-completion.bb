SUMMARY = "Minikube zsh completion"
DESCRIPTION = "Optional zsh completion for minikube."
LICENSE = "Apache-2.0"

PV = "1.38.1"

RPM_NAME = "minikube-zsh-completion-1.38.1-1.3.noarch.rpm"
RPM_HASH = "18a94dd795e442e69e49a769c9245548e9a783b7910b6e065fbbbf88edba3ef4ca369749a81893bc9eefd976b3baa8abae71053a590bc568e86f768069bed9de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minikube-zsh-completion"

RDEPENDS:${PN} += "minikube \
zsh"

inherit rpm

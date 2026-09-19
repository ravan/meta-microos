SUMMARY = "Zsh completion for skopeo"
DESCRIPTION = "This package contains the zsh completion for skopeo."
LICENSE = "Apache-2.0"

PV = "1.24.0"

RPM_NAME = "skopeo-zsh-completion-1.24.0-1.1.noarch.rpm"
RPM_HASH = "a0bd12b678411008306f3c5af4a174bfe8bffaa32e2a8e8062becebcaf0c7773c452bbf8444146244fa97fdd97a58322f7e7e04fd68f7dd584432746f9caa5e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skopeo-zsh-completion"

RDEPENDS:${PN} += "skopeo \
zsh"

inherit rpm

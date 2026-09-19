SUMMARY = "Zsh Completion for helm3"
DESCRIPTION = "Zsh command line completion support for helm3."
LICENSE = "Apache-2.0"

PV = "3.21.3"

RPM_NAME = "helm3-zsh-completion-3.21.3-6.1.noarch.rpm"
RPM_HASH = "52bb493dc16351e9b92d0128150e444af9f8646896e3ab256ecb1b40f969b88c5623efa5d8dd455841132a05ad75d29dce5f0f3464639317b5a8448dcb5a02a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helm3-zsh-completion"

RDEPENDS:${PN} += "helm3 \
zsh"

inherit rpm

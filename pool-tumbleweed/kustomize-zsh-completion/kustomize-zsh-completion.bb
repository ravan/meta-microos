SUMMARY = "Zsh Completion for kustomize"
DESCRIPTION = "zsh command line completion support for kustomize."
LICENSE = "Apache-2.0"

PV = "5.8.1"

RPM_NAME = "kustomize-zsh-completion-5.8.1-1.4.noarch.rpm"
RPM_HASH = "a5819f1fa26da4bc5fee099bf2518b35381a3a5b9c4023bb5bb3bc3cd70d9f13bb2efeedae5e08995b4b662cd66eadca958cb5de78709e686f618a0b45a90d0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kustomize-zsh-completion"

RDEPENDS:${PN} += "kustomize"

inherit rpm

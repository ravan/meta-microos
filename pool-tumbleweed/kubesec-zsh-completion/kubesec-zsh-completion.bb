SUMMARY = "Zsh Completion for kubesec"
DESCRIPTION = "zsh command line completion support for kubesec."
LICENSE = "Apache-2.0"

PV = "2.14.2"

RPM_NAME = "kubesec-zsh-completion-2.14.2-1.11.noarch.rpm"
RPM_HASH = "c3d34b271065ce9be094981df14389420ba02873871f15b7c991d7e77170bf0a434a6de2932e8c497ccc867c23dd375aa48d039dd69f96e743c6adddbe38f1e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubesec-zsh-completion"

RDEPENDS:${PN} += "kubesec"

inherit rpm

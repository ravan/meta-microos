SUMMARY = "Zsh Completion for kubeaudit"
DESCRIPTION = "zsh command line completion support for kubeaudit."
LICENSE = "MIT"

PV = "0.22.2"

RPM_NAME = "kubeaudit-zsh-completion-0.22.2-1.13.noarch.rpm"
RPM_HASH = "7c1eb90a203ca46047b01b944e72c278007119c5ed0d21e46f79d905c09d3520f2218118b2972922b9555159399e6e718189ef475dd432b022e80256d38226da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubeaudit-zsh-completion"

RDEPENDS:${PN} += "kubeaudit"

inherit rpm

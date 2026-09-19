SUMMARY = "Zsh Completion for kubearmor-client"
DESCRIPTION = "zsh command line completion support for kubearmor-client."
LICENSE = "Apache-2.0"

PV = "1.4.9"

RPM_NAME = "kubearmor-client-zsh-completion-1.4.9-1.2.noarch.rpm"
RPM_HASH = "43c2f7b054eabc1838e2ce651ee51bc647eebf95dfce45cf8c4d77887c3d89b0ba9362f4262f33ef4d061ce0d6b49253cece726c7689cd5321650a0e6c742ff1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubearmor-client-zsh-completion"

RDEPENDS:${PN} += "kubearmor-client"

inherit rpm

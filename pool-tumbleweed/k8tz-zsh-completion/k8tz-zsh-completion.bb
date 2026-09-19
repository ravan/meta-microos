SUMMARY = "Zsh Completion for k8tz"
DESCRIPTION = "zsh command line completion support for k8tz."
LICENSE = "Apache-2.0"

PV = "0.20.0"

RPM_NAME = "k8tz-zsh-completion-0.20.0-1.2.noarch.rpm"
RPM_HASH = "303aeaa6f15137a9c374269a4e98c87388856126c800b9538c5f6753813be17e5d16c594fb8e7af9913950dd9e7273b8fdaad43521982a82b30db6cd597edfab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "k8tz-zsh-completion"

RDEPENDS:${PN} += "k8tz"

inherit rpm

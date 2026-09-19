SUMMARY = "Zsh Completion for istioctl"
DESCRIPTION = "zsh command line completion support for istioctl."
LICENSE = "Apache-2.0"

PV = "1.30.4"

RPM_NAME = "istioctl-zsh-completion-1.30.4-1.1.noarch.rpm"
RPM_HASH = "02f7647a2110b47ad65b8e0794a378732cd9c700258f089fdda87a132ec68130297575c224002598f4082a6028c5d403e347a5d315894ba53728a07abe66cf24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istioctl-zsh-completion"

RDEPENDS:${PN} += "istioctl"

inherit rpm

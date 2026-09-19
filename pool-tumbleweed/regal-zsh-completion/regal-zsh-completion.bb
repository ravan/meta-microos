SUMMARY = "Zsh Completion for regal"
DESCRIPTION = "zsh command line completion support for regal."
LICENSE = "Apache-2.0"

PV = "0.42.0"

RPM_NAME = "regal-zsh-completion-0.42.0-1.2.noarch.rpm"
RPM_HASH = "22468bd23bf23554b2786b7a8b14e6e8ddaac680e10ac949114c87f251d9bd71de1db26f960ef10878190b1503f1bb88faf70662e1ddda8d0edaccdc85c2371e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "regal-zsh-completion"

RDEPENDS:${PN} += "regal \
zsh"

inherit rpm

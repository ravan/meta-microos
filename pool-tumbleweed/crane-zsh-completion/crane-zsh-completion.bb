SUMMARY = "Zsh Completion for crane"
DESCRIPTION = "zsh command line completion support for crane."
LICENSE = "Apache-2.0"

PV = "0.22.1"

RPM_NAME = "crane-zsh-completion-0.22.1-1.1.noarch.rpm"
RPM_HASH = "b6267998cad0d23957c216b55d824ecea64c797876e067c59fcf23aa537dda66414fc3848428e4c1ab12d872965ecc1b1b1d52ee99849af6d0119e647c1614ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crane-zsh-completion"

RDEPENDS:${PN} += "crane"

inherit rpm

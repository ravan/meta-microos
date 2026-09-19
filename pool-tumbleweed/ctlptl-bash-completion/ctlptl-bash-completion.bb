SUMMARY = "Bash Completion for ctlptl"
DESCRIPTION = "Bash command line completion support for ctlptl."
LICENSE = "Apache-2.0"

PV = "0.9.5"

RPM_NAME = "ctlptl-bash-completion-0.9.5-1.1.noarch.rpm"
RPM_HASH = "cc98c227692d44599a04a11ff600a6e38abd806a2804ec46edda90269457162b75f3e5016db29ff46a7b512eaf53f8c532841fc28020bfbd063325c7fa4c220c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ctlptl-bash-completion"

RDEPENDS:${PN} += "bash-completion \
ctlptl"

inherit rpm

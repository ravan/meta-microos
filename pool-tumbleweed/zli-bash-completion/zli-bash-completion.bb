SUMMARY = "Bash Completion for zli"
DESCRIPTION = "Bash command line completion support for zli."
LICENSE = "Apache-2.0"

PV = "2.1.20"

RPM_NAME = "zli-bash-completion-2.1.20-1.2.noarch.rpm"
RPM_HASH = "c473e1febfbc6cf3b11784df31f4dbd245553d722133125a7871a42ebd807b0849f7c317882c2e1a4e8db62f27744691d2f52fc19fa13e17985eff9e1e431e56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
zli"

inherit rpm

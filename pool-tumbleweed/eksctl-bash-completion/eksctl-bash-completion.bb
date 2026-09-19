SUMMARY = "Bash Completion for eksctl"
DESCRIPTION = "Bash command line completion support for eksctl."
LICENSE = "Apache-2.0"

PV = "0.230.0"

RPM_NAME = "eksctl-bash-completion-0.230.0-1.1.noarch.rpm"
RPM_HASH = "ea12a7531d432d9d9151c13e2f90bbefab0e5eb5d6061fd4d0426a339c6e2241aff6273f8be3fdc5c0d1bf4161d365328dfe9776510f46bba354880ad3fc2594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eksctl-bash-completion"

RDEPENDS:${PN} += "bash-completion \
eksctl"

inherit rpm

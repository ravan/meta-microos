SUMMARY = "Bash completion for sysdig"
DESCRIPTION = "Bash command-line completion support for sysdig."
LICENSE = "Apache-2.0"

PV = "0.41.4"

RPM_NAME = "sysdig-bash-completion-0.41.4-1.4.noarch.rpm"
RPM_HASH = "fd266487efb042d2cce0a2d6c8a4101dfeeb6bbbf4d3540e731172d9cc1d8e16f92733f436bdb7d971cad5da7685c470d68228f35a6a5ecb7f7c5dc0b5849b03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sysdig-bash-completion"

RDEPENDS:${PN} += "bash-completion \
sysdig"

inherit rpm

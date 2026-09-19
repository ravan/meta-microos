SUMMARY = "Bash Completion for cosign"
DESCRIPTION = "Bash command line completion support for cosign."
LICENSE = "Apache-2.0"

PV = "3.1.2"

RPM_NAME = "cosign-bash-completion-3.1.2-1.2.noarch.rpm"
RPM_HASH = "4416af5f61133f5f776fa8780134d593e277897ab30c562f04dc669efde9551189daf9c8dc3aa828d037827ff359bebce041df45e78950518133cb5eb9d1ef23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cosign-bash-completion"

RDEPENDS:${PN} += "bash-completion \
cosign"

inherit rpm

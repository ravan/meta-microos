SUMMARY = "Bash Completion for cmctl"
DESCRIPTION = "Bash command line completion support for cmctl."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "cmctl-bash-completion-2.5.0-1.4.noarch.rpm"
RPM_HASH = "9a074f88c68388294fd9ed7c3ca89eaf87857c617d53c15b99952915b53424480e7d19a775cd5c9eb987daa1f9b269adcabf8528812d53ba5424bf500afd1de3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmctl-bash-completion"

RDEPENDS:${PN} += "bash-completion \
cmctl"

inherit rpm

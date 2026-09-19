SUMMARY = "Bash completion for sequoia-sqv"
DESCRIPTION = "Bash command line completion support for sequoia-sqv."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "sequoia-sqv-bash-completion-1.3.0-2.3.noarch.rpm"
RPM_HASH = "c3c7271c8b4e414cca51c24cfb10ccbbc8941f5bbacdb11c36e9a84152644ea3a8cdbf01ac0a0dc8d03a7b54ebeb35436d2e35acf51f8c4c884c3fe75db151e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sequoia-sqv-bash-completion"

RDEPENDS:${PN} += "bash-completion \
sequoia-sqv"

inherit rpm

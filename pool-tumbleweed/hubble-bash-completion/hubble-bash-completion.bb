SUMMARY = "Bash Completion for hubble"
DESCRIPTION = "Bash command line completion support for hubble."
LICENSE = "Apache-2.0"

PV = "1.19.4"

RPM_NAME = "hubble-bash-completion-1.19.4-1.4.noarch.rpm"
RPM_HASH = "42a51b3d90dc0bd33b2af685373a4aff309486f77fa31842756bff1b3fd862c331f480ea09805d0bc699a5b50c8768bc5e0c1f03f148ded30f05364aa40cd641"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hubble-bash-completion"

RDEPENDS:${PN} += "bash-completion \
hubble"

inherit rpm

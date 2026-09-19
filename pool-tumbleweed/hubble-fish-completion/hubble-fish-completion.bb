SUMMARY = "Fish Completion for hubble"
DESCRIPTION = "Fish command line completion support for hubble."
LICENSE = "Apache-2.0"

PV = "1.19.4"

RPM_NAME = "hubble-fish-completion-1.19.4-1.4.noarch.rpm"
RPM_HASH = "a92959bac696930cc0a6dfa9739d43b2a0c8246952c96392482bb59df4845b9e14f8ff1b24370ae69c03ff6f2acdf85d577b434ae0ed8db31e8dfcf7ae6bcce2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hubble-fish-completion"

RDEPENDS:${PN} += "hubble"

inherit rpm

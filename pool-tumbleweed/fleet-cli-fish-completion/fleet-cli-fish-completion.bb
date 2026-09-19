SUMMARY = "Fish Completion for fleet-cli"
DESCRIPTION = "Fish command line completion support for fleet-cli."
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "fleet-cli-fish-completion-0.16.1-1.1.noarch.rpm"
RPM_HASH = "310ed70cb8f7ff62dd0502161ca892d9a4264531af23bfac5c0b8e830a7686da6018d0a0d9676273e5083d10919a5c206c33145cdb83210360033978ebdd8129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fleet-cli-fish-completion"

RDEPENDS:${PN} += "fish \
fleet-cli"

inherit rpm

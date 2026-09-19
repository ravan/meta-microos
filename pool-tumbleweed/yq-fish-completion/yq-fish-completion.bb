SUMMARY = "Fish Completion for yq"
DESCRIPTION = "Fish command line completion support for yq."
LICENSE = "MIT"

PV = "4.53.3"

RPM_NAME = "yq-fish-completion-4.53.3-2.1.noarch.rpm"
RPM_HASH = "8867fc02c950173ba9b31e17118066d2c02fdffc4473ae2d763b9975ec43b617ef2637c54e2fe88813297d3e9bb214b082f6119662bfda4212254f1db78f3620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yq-fish-completion"

RDEPENDS:${PN} += "yq"

inherit rpm

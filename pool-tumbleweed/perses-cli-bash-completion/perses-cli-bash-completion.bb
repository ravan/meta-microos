SUMMARY = "Bash Completion for perses-cli"
DESCRIPTION = "Bash command line completion support for perses-cli."
LICENSE = "Apache-2.0"

PV = "0.54.0"

RPM_NAME = "perses-cli-bash-completion-0.54.0-1.1.noarch.rpm"
RPM_HASH = "4abfa073dd5ad8154f07cf38875fae7694b6a36b4b716837b835bbe6ac0bcce310d8687b6b2c88f05bdc3926560b73411fb0e7e32c6802f2fc43b77a2db56477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perses-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
perses-cli"

inherit rpm

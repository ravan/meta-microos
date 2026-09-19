SUMMARY = "Bash Completion for kpt-cli"
DESCRIPTION = "Bash command line completion support for kpt-cli."
LICENSE = "Apache-2.0"

PV = "1.0.0~beta.67"

RPM_NAME = "kpt-cli-bash-completion-1.0.0~beta.67-1.2.noarch.rpm"
RPM_HASH = "025428f532fa996969cbc954aa35015a8de16b3e0f84dde3065c6eb8b75e731ff79a9992c0a7bb8b8424582801e62ec37733b71d31f10505f960200b0105a9c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kpt-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kpt-cli"

inherit rpm

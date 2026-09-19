SUMMARY = "Bash Completion for nova"
DESCRIPTION = "Bash command line completion support for nova."
LICENSE = "Apache-2.0"

PV = "3.12.0"

RPM_NAME = "nova-bash-completion-3.12.0-1.4.noarch.rpm"
RPM_HASH = "021c7569ff85afd9effefd40a8fff1478008f4aaae9a1b90d3ad6cd7625a015e47f724c645a40bc7ee8910db032a823ae9db43d7721221df50bb3267261d2a47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nova-bash-completion"

RDEPENDS:${PN} += "bash-completion \
nova"

inherit rpm

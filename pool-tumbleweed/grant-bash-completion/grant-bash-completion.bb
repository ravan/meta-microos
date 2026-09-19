SUMMARY = "Bash Completion for grant"
DESCRIPTION = "Bash command line completion support for grant."
LICENSE = "Apache-2.0"

PV = "0.6.8"

RPM_NAME = "grant-bash-completion-0.6.8-1.2.noarch.rpm"
RPM_HASH = "6c21b45d265b20e91c8e13e9e70488f033b947649c9f9957a59deba01aa11f33e70576267dbd05e5f79b876012a9bb74d4a330231bec433b9bddd026b2748e9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grant-bash-completion"

RDEPENDS:${PN} += "bash-completion \
grant"

inherit rpm

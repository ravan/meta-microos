SUMMARY = "Bash Completion for mcphost"
DESCRIPTION = "The official bash completion script for mcphost, generated during the build."
LICENSE = "MIT & Apache-2.0 & BSD-2-Clause & BSD-3-Clause"

PV = "0.34.0"

RPM_NAME = "mcphost-bash-completion-0.34.0-10.1.noarch.rpm"
RPM_HASH = "1c4dcf4ee041b83126993d951edbb3e0c1494100fba370e8d1e97f52a24071d2ef836c67d11925955f49512027d8f86a3bca26ba895f507c76044cd09218b851"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mcphost-bash-completion"

RDEPENDS:${PN} += "bash-completion \
mcphost"

inherit rpm

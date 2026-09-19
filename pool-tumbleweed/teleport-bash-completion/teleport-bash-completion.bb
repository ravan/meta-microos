SUMMARY = "Bash Completion for teleport"
DESCRIPTION = "Bash command line completion support for teleport."
LICENSE = "AGPL-3.0-only"

PV = "17.7.26"

RPM_NAME = "teleport-bash-completion-17.7.26-1.4.noarch.rpm"
RPM_HASH = "82d06b9a39524e60694692b5475e34691a2a4823fea577c1c70293cc302bbb34b6aed67c0d1808027bf92873bc8d0c91488e4cf73c4499fda74fa69a4716d6c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "teleport-bash-completion"

RDEPENDS:${PN} += "bash-completion \
teleport"

inherit rpm

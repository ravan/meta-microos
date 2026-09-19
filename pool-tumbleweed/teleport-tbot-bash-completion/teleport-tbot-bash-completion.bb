SUMMARY = "Bash Completion for teleport-tbot"
DESCRIPTION = "Bash command line completion support for teleport-tbot."
LICENSE = "AGPL-3.0-only"

PV = "17.7.26"

RPM_NAME = "teleport-tbot-bash-completion-17.7.26-1.4.noarch.rpm"
RPM_HASH = "c1e0857fbcad459fcac053af67791604738d108defef8a499b13613a7bfc3ba18bfa1617a343781eaf9dbc1743846fd2abc4be0cdd217e510fb1ecaaac2592a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "teleport-tbot-bash-completion"

RDEPENDS:${PN} += "bash-completion \
teleport-tbot"

inherit rpm

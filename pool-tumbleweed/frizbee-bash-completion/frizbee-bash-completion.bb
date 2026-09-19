SUMMARY = "Bash Completion for frizbee"
DESCRIPTION = "Bash command line completion support for frizbee."
LICENSE = "Apache-2.0"

PV = "0.1.11"

RPM_NAME = "frizbee-bash-completion-0.1.11-1.1.noarch.rpm"
RPM_HASH = "6f1b757f099e3ef69d84ede1d3bca5d758fe776608eff458a5c25eb381dc2810730b6ca0ea084f55e38a890b172adffb65ad36f55821aaf3c1f47752476cff7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "frizbee-bash-completion"

RDEPENDS:${PN} += "bash-completion \
frizbee"

inherit rpm

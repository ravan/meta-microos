SUMMARY = "Bash Completion for sonobuoy"
DESCRIPTION = "Bash command line completion support for sonobuoy."
LICENSE = "Apache-2.0"

PV = "0.57.5"

RPM_NAME = "sonobuoy-bash-completion-0.57.5-1.3.noarch.rpm"
RPM_HASH = "b66050981eb9b28a35bb21b1ffbea138b52db2447e589eb9fae7f59a95313dfd946144bf237426ba121c2f13663dc0aa515c60b00a47be04355aa2539b883309"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sonobuoy-bash-completion"

RDEPENDS:${PN} += "bash-completion \
sonobuoy"

inherit rpm

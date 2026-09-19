SUMMARY = "Bash Completion for k8tz"
DESCRIPTION = "Bash command line completion support for k8tz."
LICENSE = "Apache-2.0"

PV = "0.20.0"

RPM_NAME = "k8tz-bash-completion-0.20.0-1.2.noarch.rpm"
RPM_HASH = "f4d19429e1bf80ac3cd2f6c007ea06949746e17f92427804c9a6ec8929638b19c8a0fd1090a06e95d1aa54f3573dbd017073f6ce3a0514b336a4c83709e043cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "k8tz-bash-completion"

RDEPENDS:${PN} += "bash-completion \
k8tz"

inherit rpm

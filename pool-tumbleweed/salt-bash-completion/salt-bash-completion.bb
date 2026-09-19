SUMMARY = "Bash Completion for salt"
DESCRIPTION = "Bash command line completion support for salt."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-bash-completion-3006.0-70.1.noarch.rpm"
RPM_HASH = "bd8554d8bcd4c444793dffc80b61a7a66c3d82d30b8d81ebb39e0dce70d342498f6d636395ca2c5fb244c25b90086d574349ab3caad87b42ee7ca909ad98391e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-salt-bash-completion \
salt-bash-completion"

RDEPENDS:${PN} += "bash-completion \
salt"

inherit rpm

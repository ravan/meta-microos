SUMMARY = "Bash Completion for reimage"
DESCRIPTION = "Bash command line completion support for reimage."
LICENSE = "Apache-2.0"

PV = "0.15.1"

RPM_NAME = "reimage-bash-completion-0.15.1-1.2.noarch.rpm"
RPM_HASH = "091da4f2a1b5d3b24d9d3c71d00ed44604dabcb161284f715574fdb673bcc205d10f82d857a31969ed064f0e04610df4e30e392e7cce2a99c30254f2879d710d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reimage-bash-completion"

RDEPENDS:${PN} += "bash-completion \
reimage"

inherit rpm

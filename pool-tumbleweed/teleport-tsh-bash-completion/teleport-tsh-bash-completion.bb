SUMMARY = "Bash Completion for teleport-tsh"
DESCRIPTION = "Bash command line completion support for teleport-tsh."
LICENSE = "AGPL-3.0-only"

PV = "17.7.26"

RPM_NAME = "teleport-tsh-bash-completion-17.7.26-1.4.noarch.rpm"
RPM_HASH = "17eb5756a9d582a29b6fa96fd1a6e4e98f5c2e61fa64eb731d0f89b42a4a63126109c326ec62fcc7e1c0bef609422de3136d776a3fad6e70dfea9c3ba8482226"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "teleport-tsh-bash-completion"

RDEPENDS:${PN} += "bash-completion \
teleport-tsh"

inherit rpm

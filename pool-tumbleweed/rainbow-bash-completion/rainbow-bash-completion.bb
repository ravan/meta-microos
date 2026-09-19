SUMMARY = "Bash Completion for rainbow"
DESCRIPTION = "Bash completion script for rainbow."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.0"

RPM_NAME = "rainbow-bash-completion-2.8.0-1.13.noarch.rpm"
RPM_HASH = "9c59f97ff4b6ee732ba62c4164155f354f499a9687d1a310c5b65fb75e2ebfc3b45c3923e62c3a58b49239007f95dd4acb123800d7225d5c0fd5d6af3908f857"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rainbow-bash-completion"

RDEPENDS:${PN} += "bash-completion \
rainbow"

inherit rpm

SUMMARY = "Bash Completion for libvarlink"
DESCRIPTION = "Bash command-line completion support for libvarlink."
LICENSE = "MIT"

PV = "24"

RPM_NAME = "varlink-bash-completion-24-1.7.noarch.rpm"
RPM_HASH = "d47d4211895c674188e01200e055aeebb794311be3967146370229019675e520b295f9724650974c171e918a9ba14bd789e60396c37949da122933a496c16d3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "varlink-bash-completion"

RDEPENDS:${PN} += "bash-completion \
varlink-util"

inherit rpm

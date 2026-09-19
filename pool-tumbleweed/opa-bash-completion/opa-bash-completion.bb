SUMMARY = "Bash Completion for opa"
DESCRIPTION = "Bash command line completion support for opa."
LICENSE = "Apache-2.0"

PV = "1.20.1"

RPM_NAME = "opa-bash-completion-1.20.1-1.1.noarch.rpm"
RPM_HASH = "8e500e6b229337fe0cbf5606a1d02a9fc1e83d25a6a0ddfb833b851344887ed377bcbc645dd0f094f063da1783845dbf51beb98df11646c508bf619772099321"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opa-bash-completion"

RDEPENDS:${PN} += "bash-completion \
opa"

inherit rpm

SUMMARY = "Bash Completion for longhornctl"
DESCRIPTION = "Bash command line completion support for longhornctl."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "longhornctl-bash-completion-1.10.0-1.8.noarch.rpm"
RPM_HASH = "b9e99508914b297baba6e2b899471c41de10f5ef1f93a9feec2b1f1e9bef4a17a1f908d26abcd0fc0f5a950c7c410aa816fc681c328e531901e0101a88fcc569"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "longhornctl-bash-completion"

RDEPENDS:${PN} += "bash-completion \
longhornctl"

inherit rpm

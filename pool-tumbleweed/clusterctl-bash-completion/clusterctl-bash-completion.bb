SUMMARY = "Bash Completion for clusterctl"
DESCRIPTION = "Bash command line completion support for clusterctl."
LICENSE = "Apache-2.0"

PV = "1.14.0"

RPM_NAME = "clusterctl-bash-completion-1.14.0-1.1.noarch.rpm"
RPM_HASH = "69da12d17865a50e9a577f72a64d36ca567fbcf8be244a61a823c54185c19d45fc6efe835130d24d4293caaccf3be0f49bcc058d244a45eda5c07afe06d65951"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clusterctl-bash-completion"

RDEPENDS:${PN} += "bash-completion \
clusterctl"

inherit rpm

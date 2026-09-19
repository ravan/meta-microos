SUMMARY = "Bash Completion for clusteradm"
DESCRIPTION = "Bash command line completion support for clusteradm."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "clusteradm-bash-completion-1.3.1-1.4.noarch.rpm"
RPM_HASH = "0dcbb92c25c690e3dacda2f349a69f0e5bf433bbc6688e9af358ae7d3f2e8597255c1b4cffa5b152a54fc5b8fef166619e50766bcb62afe73d5d5538475eaf7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clusteradm-bash-completion"

RDEPENDS:${PN} += "bash-completion \
clusteradm"

inherit rpm

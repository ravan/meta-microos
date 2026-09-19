SUMMARY = "Fish Completion for clusteradm"
DESCRIPTION = "Fish command line completion support for clusteradm."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "clusteradm-fish-completion-1.3.1-1.4.noarch.rpm"
RPM_HASH = "b93070ec748dd7e1d87012199e706cadc0c2035e7e6ba5a659266fa70418b7af54ef51f636c840ae9f278fb4e0876103030e60bb6fd23ccacd4237519fb602df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clusteradm-fish-completion"

RDEPENDS:${PN} += "clusteradm \
fish"

inherit rpm

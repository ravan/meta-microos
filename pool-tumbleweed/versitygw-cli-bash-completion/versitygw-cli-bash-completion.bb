SUMMARY = "Bash Completion for versitygw"
DESCRIPTION = "Bash command line completion support for versitygw."
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "versitygw-cli-bash-completion-1.7.0-1.2.noarch.rpm"
RPM_HASH = "44ff28dcbe6ab7ae18941311314f749f38f4da1bcfcf745789c61b59309e81cc2ae770ce4d088b63d7f02554157e6eb61874d3aacbbd385ada3d4cc4312f6f27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "versitygw-bash-completion \
versitygw-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
versitygw-cli"

inherit rpm

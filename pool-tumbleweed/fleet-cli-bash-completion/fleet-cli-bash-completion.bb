SUMMARY = "Bash Completion for fleet-cli"
DESCRIPTION = "Bash command line completion support for fleet-cli."
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "fleet-cli-bash-completion-0.16.1-1.1.noarch.rpm"
RPM_HASH = "6eb1af318a9c9f5bfd89d107550067e5098a5a44ee8423329dc7136c69a0756387b2300fa184de79c356f619530f55b96020ae101001945d91598d48707acdc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fleet-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
fleet-cli"

inherit rpm

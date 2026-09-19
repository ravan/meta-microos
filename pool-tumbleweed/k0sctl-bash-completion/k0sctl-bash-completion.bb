SUMMARY = "Bash Completion for k0sctl"
DESCRIPTION = "Bash command line completion support for k0sctl."
LICENSE = "Apache-2.0"

PV = "0.32.2"

RPM_NAME = "k0sctl-bash-completion-0.32.2-1.1.noarch.rpm"
RPM_HASH = "876081a44560d4af865f95bdf844c8c25d59842380d803f2ae0e281339d817efaf86f8cf356a4468c01327f0d7c13892ffe786ddd02b4841f60e15d88fdc5e03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "k0sctl-bash-completion"

RDEPENDS:${PN} += "bash-completion \
k0sctl"

inherit rpm

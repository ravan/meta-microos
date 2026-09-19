SUMMARY = "Bash Completion for cilium-cli"
DESCRIPTION = "Bash command line completion support for cilium-cli."
LICENSE = "Apache-2.0"

PV = "0.19.7"

RPM_NAME = "cilium-cli-bash-completion-0.19.7-1.1.noarch.rpm"
RPM_HASH = "51464c6128576d3da966f6dceced22711ed34325ee5cb925824cdc65bbf9832ed84b07403a44e9d526a031922988432fecc40331572c83bd1cae0b53e2ab55ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cilium-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
cilium-cli"

inherit rpm

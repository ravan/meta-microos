SUMMARY = "Bash Completion for digger-cli"
DESCRIPTION = "Bash command line completion support for digger-cli."
LICENSE = "Apache-2.0"

PV = "0.6.149"

RPM_NAME = "digger-cli-bash-completion-0.6.149-1.1.noarch.rpm"
RPM_HASH = "ca15548559de3b88c9150e1a7c118bf6acdd3d4e73c8cfa2db8d8df5a2e2dd43543908a3843b526b1c8d416888e41ffbf5e8962b9ed15eefe8c48e03da4d0b7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "digger-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
digger-cli"

inherit rpm

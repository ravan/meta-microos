SUMMARY = "Zsh Completion for digger-cli"
DESCRIPTION = "zsh command line completion support for digger-cli."
LICENSE = "Apache-2.0"

PV = "0.6.149"

RPM_NAME = "digger-cli-zsh-completion-0.6.149-1.1.noarch.rpm"
RPM_HASH = "bfa003866a59ff88cdfb6e996bf9af1e705f5423edfe578365451f8d894221e12ced47b70901abeef3de8a1088b50fc81611a2492937c8fdae725b9cabeed3d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "digger-cli-zsh-completion"

RDEPENDS:${PN} += "digger-cli"

inherit rpm

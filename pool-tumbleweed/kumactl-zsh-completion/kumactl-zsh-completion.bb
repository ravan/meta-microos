SUMMARY = "Zsh Completion for kumactl"
DESCRIPTION = "zsh command line completion support for kumactl."
LICENSE = "Apache-2.0"

PV = "2.14.3"

RPM_NAME = "kumactl-zsh-completion-2.14.3-1.1.noarch.rpm"
RPM_HASH = "c4862c83b0a584356a01ba45888c06cc0875fb91d34aa563796242acf34a535d857a24fd06dcf4acc59d88d9547236307e6c6e2e4e1497382dd26443f4de90ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kumactl-zsh-completion"

RDEPENDS:${PN} += "kumactl"

inherit rpm

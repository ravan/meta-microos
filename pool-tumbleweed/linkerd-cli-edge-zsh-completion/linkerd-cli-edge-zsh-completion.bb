SUMMARY = "Zsh Completion for linkerd-cli-edge"
DESCRIPTION = "zsh command line completion support for linkerd-cli-edge."
LICENSE = "Apache-2.0"

PV = "26.8.4"

RPM_NAME = "linkerd-cli-edge-zsh-completion-26.8.4-1.1.noarch.rpm"
RPM_HASH = "33c7d2a6ebe1ce93c3212115599cb6bae9e5bdaca6e7e16ea0c222245cdbba33695930f8d74f3024c84fbf13efb435f6ca20b562a9a28b776b97f157d7bd511c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "linkerd-cli-edge-zsh-completion"

RDEPENDS:${PN} += "linkerd-cli-edge"

inherit rpm

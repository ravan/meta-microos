SUMMARY = "Zsh Completion for clusterctl"
DESCRIPTION = "zsh command line completion support for clusterctl."
LICENSE = "Apache-2.0"

PV = "1.14.0"

RPM_NAME = "clusterctl-zsh-completion-1.14.0-1.1.noarch.rpm"
RPM_HASH = "c53d74a4dcb66716a00ae479ad4856991a2a70afe6ae2e04d2b7035777968ad43e5ff0529630e34c0bf975e7f1cbf660118046c68e612617bf5a77c5a0b8aa67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clusterctl-zsh-completion"

RDEPENDS:${PN} += "clusterctl"

inherit rpm

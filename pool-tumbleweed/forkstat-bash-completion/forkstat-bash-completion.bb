SUMMARY = "Bash Completion for forkstat"
DESCRIPTION = "Bash completion script for forkstat."
LICENSE = "GPL-2.0-or-later"

PV = "0.04.00"

RPM_NAME = "forkstat-bash-completion-0.04.00-1.3.noarch.rpm"
RPM_HASH = "e2a3e6d6aedc57a6d099d9e0bacf7ee4e1bf9770fe492851fde365ac8f8fdd872c74286f178f4e04f1ce72af54da7dcb16629d6d6f4f5398635a2f6b68d3dbf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "forkstat-bash-completion"

RDEPENDS:${PN} += "bash-completion \
forkstat"

inherit rpm

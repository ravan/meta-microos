SUMMARY = "Bash Completion for fnotifystat"
DESCRIPTION = "Bash completion script for fnotifystat."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.06"

RPM_NAME = "fnotifystat-bash-completion-0.02.06-1.23.noarch.rpm"
RPM_HASH = "bee123c9309ab73385641a930f9a7ed2d2bdff01567737c962c9eb8345ef546c8415aebfe06078168a64ade9525eb12707993da64979413ecbb8f091988b44a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fnotifystat-bash-completion"

RDEPENDS:${PN} += "bash-completion \
fnotifystat"

inherit rpm

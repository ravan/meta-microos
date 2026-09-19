SUMMARY = "Bash Completion for kubectl-switch"
DESCRIPTION = "Bash command line completion support for kubectl-switch."
LICENSE = "MIT"

PV = "2.4.32"

RPM_NAME = "kubectl-switch-bash-completion-2.4.32-1.1.noarch.rpm"
RPM_HASH = "01c4f5ef382555263a84a91af2a7d32d65ee37c79bb0e1eb9bdb49aebb9cdeabad6a61ad70d6a56033874d08e7a97185e405b6ccd571cccd533c7d4a0c1cddc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectl-switch-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubectl-switch"

inherit rpm

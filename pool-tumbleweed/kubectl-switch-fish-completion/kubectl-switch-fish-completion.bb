SUMMARY = "Fish Completion for kubectl-switch"
DESCRIPTION = "Fish command line completion support for kubectl-switch."
LICENSE = "MIT"

PV = "2.4.32"

RPM_NAME = "kubectl-switch-fish-completion-2.4.32-1.1.noarch.rpm"
RPM_HASH = "0ce8f19e15e538298be607641708e06ce0c9a7ad4045699704b1162a32acffd66abe103db20f495886768ed2c4486431bcb9d02ffcf2625794d66ee40ed4a961"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectl-switch-fish-completion"

RDEPENDS:${PN} += "fish \
kubectl-switch"

inherit rpm

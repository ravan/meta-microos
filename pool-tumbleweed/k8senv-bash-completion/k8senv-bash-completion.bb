SUMMARY = "Bash Completion for k8senv"
DESCRIPTION = "Bash command line completion support for k8senv."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "k8senv-bash-completion-1.1.1-1.13.noarch.rpm"
RPM_HASH = "d28e26a0f9164298c4f0695f2d3b6ac5cf2e074b5f0b3d12a3b708c2859e1c7c08f6d122f1f405df0c592fa8ebb48d075ff0e849cfff8a08a9a38790bd5473c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "k8senv-bash-completion"

RDEPENDS:${PN} += "bash-completion \
k8senv"

inherit rpm

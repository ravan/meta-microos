SUMMARY = "Bash Completion for kustomize"
DESCRIPTION = "Bash command line completion support for kustomize."
LICENSE = "Apache-2.0"

PV = "5.8.1"

RPM_NAME = "kustomize-bash-completion-5.8.1-1.4.noarch.rpm"
RPM_HASH = "35c160563b7e921f5c68e8deb3056d6b12529ddf77421fee0edee493448884c1fff13e4d2997a5a2484c3ba4a933b139598023235e5325a9b78328e19c9a473f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kustomize-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kustomize"

inherit rpm

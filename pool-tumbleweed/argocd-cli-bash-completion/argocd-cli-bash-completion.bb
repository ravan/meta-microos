SUMMARY = "Bash Completion for argocd-cli"
DESCRIPTION = "Bash command line completion support for argocd-cli."
LICENSE = "Apache-2.0"

PV = "3.5.2"

RPM_NAME = "argocd-cli-bash-completion-3.5.2-1.1.noarch.rpm"
RPM_HASH = "d524255e19946ac1d6d82b999c9de7b6c67fbce247d13409f8d9c44ff51e37c3ef3467e0bbfcca12298dfa11edbb2ffbb7f71646efd4c0577a9dd1bde153d284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "argocd-cli-bash-completion"

RDEPENDS:${PN} += "argocd-cli \
bash-completion"

inherit rpm

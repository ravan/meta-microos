SUMMARY = "Bash Completion for kargo-cli"
DESCRIPTION = "Bash command line completion support for kargo-cli."
LICENSE = "Apache-2.0"

PV = "1.11.2"

RPM_NAME = "kargo-cli-bash-completion-1.11.2-1.1.noarch.rpm"
RPM_HASH = "aeabce857e72ff25141e1f6197d7951a814189632f3cb78374dd8028d4d8399a6b9db0eebee18b62d0272d85857cfa6a42c0f53c2481a68fe388619ecb634184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kargo-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kargo-cli"

inherit rpm

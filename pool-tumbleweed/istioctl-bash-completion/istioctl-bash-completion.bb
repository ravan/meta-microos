SUMMARY = "Bash Completion for istioctl"
DESCRIPTION = "Bash command line completion support for istioctl."
LICENSE = "Apache-2.0"

PV = "1.30.4"

RPM_NAME = "istioctl-bash-completion-1.30.4-1.1.noarch.rpm"
RPM_HASH = "72aadc907f5a3cbc27f9daca307294271bd07603854aaeb721028a4b38138616e247dbc58cc1923f80bc7a557bdec083835cf9b8a7f5f07acb664a7e966c7054"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istioctl-bash-completion"

RDEPENDS:${PN} += "bash-completion \
istioctl"

inherit rpm

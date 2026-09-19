SUMMARY = "Bash Completion for kubectl-klock"
DESCRIPTION = "Bash command line completion support for kubectl-klock."
LICENSE = "Apache-2.0 & GPL-3.0-or-later & CC-BY-4.0 & CC0-1.0"

PV = "0.9.2"

RPM_NAME = "kubectl-klock-bash-completion-0.9.2-1.1.noarch.rpm"
RPM_HASH = "0b922bc1ce58bede422092838e8f4d8c9996c15498366155c805216013da277a261396ef51e6685d3de43fb2fb5b909679594ec465d22e1d62137de809b2eb5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubectl-klock-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubectl-klock"

inherit rpm

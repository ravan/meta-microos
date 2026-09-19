SUMMARY = "Bash Completion for eventstat"
DESCRIPTION = "Bash completion script for eventstat."
LICENSE = "GPL-2.0-or-later"

PV = "0.06.00"

RPM_NAME = "eventstat-bash-completion-0.06.00-1.10.noarch.rpm"
RPM_HASH = "73ed63a2eae48c6c2940194bd9a84a41124e6b90a84b1702cc69c81e01cb851e4312e5d20e7813c57e1f83fd57389e599adc2fe5c1d266fc070ef21cd5670abc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eventstat-bash-completion"

RDEPENDS:${PN} += "bash-completion \
eventstat"

inherit rpm

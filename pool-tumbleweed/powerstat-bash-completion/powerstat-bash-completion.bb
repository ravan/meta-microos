SUMMARY = "Bash Completion for powerstat"
DESCRIPTION = "Bash completion script for powerstat."
LICENSE = "GPL-2.0-only"

PV = "0.04.03"

RPM_NAME = "powerstat-bash-completion-0.04.03-1.10.noarch.rpm"
RPM_HASH = "ca860cbd261137046201771cb94daa098798fc7dda3796728201b12d6afb44ab455cecfca8c76b7ee7bb70bad2e5b0ee78b8e1378d1a219fff284edc731d940a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "powerstat-bash-completion"

RDEPENDS:${PN} += "bash-completion \
powerstat"

inherit rpm

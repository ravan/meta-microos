SUMMARY = "Bash completion for gnuastro"
DESCRIPTION = "Bash command line completion support for gnuastro"
LICENSE = "GPL-3.0-or-later"

PV = "0.24"

RPM_NAME = "gnuastro-bash-completion-0.24-1.5.noarch.rpm"
RPM_HASH = "26c79d5d290033b9d34a7e785dc0b414a89bc449699ce61df36cd9066ac401a95583171e921a53a80fb6d4a6b0c34c686be89e12721c94afd7000c2a99467045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuastro-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm

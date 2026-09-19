SUMMARY = "Bash Completion for sluice"
DESCRIPTION = "Bash completion script for sluice."
LICENSE = "GPL-2.0-or-later"

PV = "0.03.01"

RPM_NAME = "sluice-bash-completion-0.03.01-1.5.noarch.rpm"
RPM_HASH = "35fcf28e5b5088930bf376a3af7c1ac585a3f35f292083216f092595f584a0c155fd5c040186b2a656067ccdba3ba0ea3b686f40daf791cfe17559b71e21897c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sluice-bash-completion"

RDEPENDS:${PN} += "bash-completion \
sluice"

inherit rpm

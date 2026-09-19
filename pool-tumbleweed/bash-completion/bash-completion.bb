SUMMARY = "Programmable Completion for Bash"
DESCRIPTION = " \
 \
 \
 \
bash-completion is a collection of shell functions that take advantage \
of the programmable completion feature of Bash 2.04 and later."
LICENSE = "GPL-2.0-or-later"

PV = "2.17.0"

RPM_NAME = "bash-completion-2.17.0-1.1.noarch.rpm"
RPM_HASH = "cdb6c8ae1e71250cb0d6cca7c622beeec7173d8f477a6cfe9839e7b990d3fbab69430580b5d9a3188700dd59f5083497dcbc34fa00a8807c2b88acf5ffb4d65a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bash-completion \
config-bash-completion"

RDEPENDS:${PN} += "bash"

inherit rpm

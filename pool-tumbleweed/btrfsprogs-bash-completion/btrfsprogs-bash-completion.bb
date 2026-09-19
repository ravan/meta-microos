SUMMARY = "Bash completion for btrfsprogs"
DESCRIPTION = "Command line completion support for bas for utilities from btrfsprogs."
LICENSE = "GPL-2.0-only"

PV = "7.1"

RPM_NAME = "btrfsprogs-bash-completion-7.1-1.2.aarch64.rpm"
RPM_HASH = "2822258d3a6216dae19a07119fd399c8edfd957e166339c735133417c91cac1eeff15298fb313880ee84825d39cc10086e316f98dd67435d434eba80d18c58ee"

RPROVIDES:${PN} += "btrfsprogs-bash-completion"

RDEPENDS:${PN} += "bash-completion \
btrfsprogs"

inherit rpm

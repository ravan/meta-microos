SUMMARY = "Fish Completion for bspwm"
DESCRIPTION = "Fish completion for bspc"
LICENSE = "BSD-2-Clause"

PV = "0.9.12"

RPM_NAME = "bspwm-fish-completion-0.9.12-1.5.noarch.rpm"
RPM_HASH = "4d90463d20a7f0d90b67fcecf88be51c7166454052ee4c17b15c59a5061a053ae0f461eb20350a5bfe69684bab35a29374437abbe90ddd446303004ff8bac849"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bspwm-fish-completion"

RDEPENDS:${PN} += "bspwm"

inherit rpm

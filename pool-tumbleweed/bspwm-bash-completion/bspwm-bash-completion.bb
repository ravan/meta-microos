SUMMARY = "Bash Completion for bspwm"
DESCRIPTION = "Bash completion for bspc"
LICENSE = "BSD-2-Clause"

PV = "0.9.12"

RPM_NAME = "bspwm-bash-completion-0.9.12-1.5.noarch.rpm"
RPM_HASH = "8867b6058d982ce220806ed083e29e279e2d6d38ea3a1892a3f66c66f20244d5b8b387f6a82d250033fd72e791720ac5f59c47a9732f1b944649f5ca70f3e1dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bspwm-bash-completion"

RDEPENDS:${PN} += "bash-completion \
bspwm"

inherit rpm

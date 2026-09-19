SUMMARY = "Bash Completion for health-check"
DESCRIPTION = "Bash completion script for health-check."
LICENSE = "GPL-2.0-or-later"

PV = "0.03.09"

RPM_NAME = "health-check-bash-completion-0.03.09-1.22.noarch.rpm"
RPM_HASH = "91c3061836af3314c87b428bd6347ec972fed842d83afa2a096d64e46196a6e9df7978cf66483a8de82afe158f33f8c054095f29384d36abfa7c1231016b9998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "health-check-bash-completion"

RDEPENDS:${PN} += "bash-completion \
health-check"

inherit rpm

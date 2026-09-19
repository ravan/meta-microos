SUMMARY = "Bash Completion for tdiff"
DESCRIPTION = "Bash completion script for tdiff."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.9"

RPM_NAME = "tdiff-bash-completion-0.8.9-1.5.noarch.rpm"
RPM_HASH = "d6ac0808a33f62bbd3179a8a25eab49376a6625bd3adb43c12e394a89888cba1ccf7fde28cbca9769d28278b53b44388685bdf9952c5c450ab675677fd003e79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tdiff-bash-completion"

RDEPENDS:${PN} += "bash-completion \
tdiff"

inherit rpm

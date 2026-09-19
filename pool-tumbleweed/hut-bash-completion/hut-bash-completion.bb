SUMMARY = "Bash Completion for hut"
DESCRIPTION = "The official bash completion script for hut."
LICENSE = "AGPL-3.0-or-later"

PV = "0.8.0"

RPM_NAME = "hut-bash-completion-0.8.0-1.4.noarch.rpm"
RPM_HASH = "755a1ed84f7f5d6ce66124130fbaa94f022f0ad1dec50fb50ede402e9c7ba734784d0909111218e828d47524a8ebc2df03e62ced4b5a66ebfa2cab443a5ffd33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hut-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm

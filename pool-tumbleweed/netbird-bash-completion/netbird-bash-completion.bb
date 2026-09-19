SUMMARY = "Bash Completion for netbird"
DESCRIPTION = "Bash command line completion support for netbird."
LICENSE = "AGPL-3.0-only & BSD-3-Clause"

PV = "0.78.1"

RPM_NAME = "netbird-bash-completion-0.78.1-1.1.noarch.rpm"
RPM_HASH = "9ef7dc548b67449166275a8b57f2cdabc74bb6ad374633f32254c8290f54b7eda96f7b22054cfcc65d312c03252c80364bdd008559ed5addf7e3f85e63edadab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netbird-bash-completion"

RDEPENDS:${PN} += "bash-completion \
netbird"

inherit rpm

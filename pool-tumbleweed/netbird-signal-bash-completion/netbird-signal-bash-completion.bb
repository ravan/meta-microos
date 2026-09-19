SUMMARY = "Bash Completion for netbird-management"
DESCRIPTION = "Bash command line completion support for netbird-signal."
LICENSE = "AGPL-3.0-only & BSD-3-Clause"

PV = "0.78.1"

RPM_NAME = "netbird-signal-bash-completion-0.78.1-1.1.noarch.rpm"
RPM_HASH = "ce8a3767deb351ac77acd68e3edbf80a91b3de617e913d848a6917d3f9294c8a8488d0d84c659de0c5c7b07a3f24da344de584d6f2145fb3e1654b7879313b99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netbird-signal-bash-completion"

RDEPENDS:${PN} += "bash-completion \
netbird-signal"

inherit rpm

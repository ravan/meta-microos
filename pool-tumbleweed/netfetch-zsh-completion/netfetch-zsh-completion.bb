SUMMARY = "Zsh Completion for netfetch"
DESCRIPTION = "zsh command line completion support for netfetch."
LICENSE = "MIT"

PV = "0.5.4"

RPM_NAME = "netfetch-zsh-completion-0.5.4-1.10.noarch.rpm"
RPM_HASH = "483bc8073443f994c0c577c74978130a04ff47f0623ee23ce290d33dd85e68ce4131ae951443f01326a09412af303fe17b2af3a174463b823868d255260eb709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netfetch-zsh-completion"

RDEPENDS:${PN} += "netfetch"

inherit rpm

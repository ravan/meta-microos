SUMMARY = "Bash Completion for eza"
DESCRIPTION = "Bash command line completion support for eza."
LICENSE = "EUPL-1.2"

PV = "0.23.5"

RPM_NAME = "eza-bash-completion-0.23.5-1.3.noarch.rpm"
RPM_HASH = "5123f88c2d8491f5a0201279b0ce926e613a55c81b8c4c826009db1886d985eff009ecaa25148f6440d96ce1c3d8e959e7a821711a68eb6eddda09d3a6f60b24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eza-bash-completion"

RDEPENDS:${PN} += "eza"

inherit rpm

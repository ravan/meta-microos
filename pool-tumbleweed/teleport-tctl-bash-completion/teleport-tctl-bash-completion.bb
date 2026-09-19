SUMMARY = "Bash Completion for teleport-tctl"
DESCRIPTION = "Bash command line completion support for teleport-tctl."
LICENSE = "AGPL-3.0-only"

PV = "17.7.26"

RPM_NAME = "teleport-tctl-bash-completion-17.7.26-1.4.noarch.rpm"
RPM_HASH = "0c0f4ba8c0c4e3f853f9185d7a761078cb7dec81be41a53a79b7ce06876045f2f80ee86d2d048ad87045053c9dc46e8f0d3fdebecd16561cc8f6419665454af5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "teleport-tctl-bash-completion"

RDEPENDS:${PN} += "bash-completion \
teleport-tctl"

inherit rpm

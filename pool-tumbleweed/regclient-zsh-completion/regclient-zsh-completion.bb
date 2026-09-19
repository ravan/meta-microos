SUMMARY = "Zsh Completion for regclient"
DESCRIPTION = "zsh command line completion support for regclient."
LICENSE = "Apache-2.0"

PV = "0.11.5"

RPM_NAME = "regclient-zsh-completion-0.11.5-1.4.noarch.rpm"
RPM_HASH = "9e294725b3cc8e4489616521fa7fc992a72fc06fc3022ca9f186cb63ccb35825c8c1670fd9aa49e45b9d7d2eefe4b03ac250c18a90d1ed99bdff6a91f65f923f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "regclient-zsh-completion"

RDEPENDS:${PN} += "regclient"

inherit rpm

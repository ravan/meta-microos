SUMMARY = "Fish completion for atuin"
DESCRIPTION = "Fish command line completion support for atuin."
LICENSE = "MIT"

PV = "18.22.0"

RPM_NAME = "atuin-fish-completion-18.22.0-1.1.noarch.rpm"
RPM_HASH = "ed6042e7bd0f772af832f950a0a8bb02c4c21ed1bbcc1a55b9a4d8c5b858f21c46b2e323dbf5a48f0eb0f3ec57afc1d0bb826116233e776b2880081572cf39c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atuin-fish-completion"

RDEPENDS:${PN} += "atuin"

inherit rpm

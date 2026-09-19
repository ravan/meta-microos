SUMMARY = "Nushell Completion for ghostty"
DESCRIPTION = "Nushell support for ghostty."
LICENSE = "MIT & OFL-1.1"

PV = "1.3.1"

RPM_NAME = "ghostty-nushell-completion-1.3.1-1.6.noarch.rpm"
RPM_HASH = "62c45530bb292483003a1b3c4821094e095441f7e20b8e289a1568f7febeb1af6d0659870dc76a297cd55b38b6d1a0e17aa04ca28f280858d2b93beb02a65516"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghostty-nushell-completion"

RDEPENDS:${PN} += "ghostty \
nushell"

inherit rpm

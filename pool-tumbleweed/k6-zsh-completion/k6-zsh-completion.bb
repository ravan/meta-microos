SUMMARY = "Zsh Completion for k6"
DESCRIPTION = "zsh command line completion support for k6."
LICENSE = "AGPL-3.0"

PV = "2.1.0"

RPM_NAME = "k6-zsh-completion-2.1.0-1.3.noarch.rpm"
RPM_HASH = "0536d61f5878f017c03089e9f32244114f603116a77efd23ca441bbbd21a7d615d5eccba6107658a82d4d5294bf1945b0a73ece6a5dd796713c3fe2e24e12489"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "k6-zsh-completion"

RDEPENDS:${PN} += "k6"

inherit rpm

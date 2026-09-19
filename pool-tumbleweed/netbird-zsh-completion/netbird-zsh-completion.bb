SUMMARY = "Zsh Completion for netbird"
DESCRIPTION = "Zsh command line completion support for netbird."
LICENSE = "AGPL-3.0-only & BSD-3-Clause"

PV = "0.78.1"

RPM_NAME = "netbird-zsh-completion-0.78.1-1.1.noarch.rpm"
RPM_HASH = "d6e0c81706eea8f775ddf6fd83190d41bbc0b758428536b1b110de3311e0ae12e777622244bd0095d41d338101307051fa81a49feadbde88443b16e10b2bb95b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netbird-zsh-completion"

RDEPENDS:${PN} += "netbird \
zsh"

inherit rpm

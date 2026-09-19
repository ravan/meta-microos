SUMMARY = "Zsh Completion for ctlptl"
DESCRIPTION = "zsh command line completion support for ctlptl."
LICENSE = "Apache-2.0"

PV = "0.9.5"

RPM_NAME = "ctlptl-zsh-completion-0.9.5-1.1.noarch.rpm"
RPM_HASH = "9ff29fc6b2fb468ded1f18ff51aad867af40ded686a9e11fdae21c48425dee32ca07a13d9287ed5a63fbf1c9639f40a5dc903845beadffdc8b37217f8e8b162e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ctlptl-zsh-completion"

RDEPENDS:${PN} += "ctlptl \
zsh"

inherit rpm

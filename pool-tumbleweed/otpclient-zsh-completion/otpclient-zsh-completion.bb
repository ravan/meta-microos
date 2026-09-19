SUMMARY = "Zsh completion for otpclient"
DESCRIPTION = "Zsh command line completion support for otpclient."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.8"

RPM_NAME = "otpclient-zsh-completion-5.1.8-1.1.noarch.rpm"
RPM_HASH = "2813a9f5780351e0301a610100312aed3ad37e7b0b3f887102fa84a2f0e58f407b381ad0858331cd263bcf459bf408177bb9fa8458a1110a20180262864a8b88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "otpclient-zsh-completion"

RDEPENDS:${PN} += "otpclient \
zsh"

inherit rpm

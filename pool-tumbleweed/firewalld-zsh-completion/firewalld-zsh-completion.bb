SUMMARY = "Zsh Completion for firewalld"
DESCRIPTION = "Zsh command line completion support for firewalld."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.2"

RPM_NAME = "firewalld-zsh-completion-2.3.2-2.1.noarch.rpm"
RPM_HASH = "04bba1b07da61c22c2ec77806be3bdb3c969e1b4c26e0f2fbc552547a91946afc919ca06b7490661c6c638cf9dc079bdf5dbdaccaaf7b76e66769ae2af463db1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewalld-zsh-completion"

RDEPENDS:${PN} += "firewalld \
zsh"

inherit rpm

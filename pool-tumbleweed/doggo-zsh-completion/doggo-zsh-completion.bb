SUMMARY = "zsh completion for doggo"
DESCRIPTION = "zsh completion scripts for doggo"
LICENSE = "GPL-3.0-only"

PV = "1.3.0"

RPM_NAME = "doggo-zsh-completion-1.3.0-1.1.noarch.rpm"
RPM_HASH = "9a376af8257ca1a159bf7124d5254ce55c4441a9b0fc052ad448f6c0db43f839e00c8b0b4c2c922b8eeb2378ecd1f9a7b173e1792cf11382cdea52edeb60327c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "doggo-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Zsh completion for nheko"
DESCRIPTION = "This package contain the zsh completion command for the nheko matrix client."
LICENSE = "Apache-2.0 & GPL-3.0-or-later & CC-BY-4.0"

PV = "0.12.1"

RPM_NAME = "nheko-zsh-completion-0.12.1-4.14.noarch.rpm"
RPM_HASH = "b59755daa5056407e622836b537bb17348218a0d379b0383e9badd246565ab8e29bdffffbea79d6a579c257b3985c4cdc23ee9b668da43ab4a60388a61b64660"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nheko-zsh-completion"

RDEPENDS:${PN} += "nheko \
zsh"

inherit rpm

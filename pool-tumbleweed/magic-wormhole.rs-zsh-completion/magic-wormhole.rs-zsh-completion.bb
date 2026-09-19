SUMMARY = "Zsh Completion for magic-wormhole.rs"
DESCRIPTION = "Zsh command-line completion support for magic-wormhole.rs."
LICENSE = "EUPL-1.2"

PV = "0.8.1"

RPM_NAME = "magic-wormhole.rs-zsh-completion-0.8.1-1.3.noarch.rpm"
RPM_HASH = "c7da464b5019d9f735707edb883ae1193de5a640935d3845806a533c82b0251cbc27fc2d0b380f323f76bc78b717ffe82ed727424ac1a7c8928b6ee71dc4aacd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "magic-wormhole.rs-zsh-completion"

RDEPENDS:${PN} += "magic-wormhole.rs \
zsh"

inherit rpm

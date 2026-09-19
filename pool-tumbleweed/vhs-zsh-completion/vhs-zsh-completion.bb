SUMMARY = "Zsh Completion for vhs"
DESCRIPTION = "Zsh command-line completion support for vhs."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "vhs-zsh-completion-0.9.0-1.19.noarch.rpm"
RPM_HASH = "c34942e1a6721dfc7bd2ebad62eeb23d0071ce44b700d8e81e35313fd110808fd92b8b1ce70ed4284b38cb2fd94b867c1441fd9d64cbdd9653b2477df1209d71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vhs-zsh-completion"

RDEPENDS:${PN} += "vhs \
zsh"

inherit rpm

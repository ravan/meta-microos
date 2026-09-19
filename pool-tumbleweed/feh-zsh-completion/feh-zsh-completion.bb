SUMMARY = "ZSH Completion for feh"
DESCRIPTION = "ZSH completion script for feh 3."
LICENSE = "LGPL-2.0-or-later & MIT"

PV = "3.11.1"

RPM_NAME = "feh-zsh-completion-3.11.1-1.7.noarch.rpm"
RPM_HASH = "b97b929a3dedfe8361b9948a52b999724b4e3f6e62cad723fbd7323afa977a3ee9621caa77de3087060bfba1ca40b4fa00b1409ff88b1da8893d73797adf7db6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "feh-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm

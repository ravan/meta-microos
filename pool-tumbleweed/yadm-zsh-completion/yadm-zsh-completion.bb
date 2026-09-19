SUMMARY = "ZSH Completion for yadm"
DESCRIPTION = "The official zsh completion script for yadm."
LICENSE = "GPL-3.0-only"

PV = "3.3.0"

RPM_NAME = "yadm-zsh-completion-3.3.0-1.6.noarch.rpm"
RPM_HASH = "0455c6df0b0821c15f64ad9ca9501e0c7b27d964b82a2bb00138828624ebc7553ef72038e74c9aff0d43319a52b44f94c50ab61a1b1b5fcc55ce8cf38f1adc75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yadm-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm

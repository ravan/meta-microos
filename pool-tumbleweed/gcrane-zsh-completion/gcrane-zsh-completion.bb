SUMMARY = "Zsh Completion for gcrane"
DESCRIPTION = "zsh command line completion support for gcrane."
LICENSE = "Apache-2.0"

PV = "0.22.1"

RPM_NAME = "gcrane-zsh-completion-0.22.1-1.1.noarch.rpm"
RPM_HASH = "0b2f8982f16a754ccab92954e51823e6a2df91fc3c6af8236e7868ac3ffb912dc7789a7c5127de9b2eb1fe15a2c69cd58e15849b6fd5f6be083201afaab125e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcrane-zsh-completion"

RDEPENDS:${PN} += "gcrane"

inherit rpm

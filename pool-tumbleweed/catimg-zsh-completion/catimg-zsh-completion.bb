SUMMARY = "ZSH Completion for catimg"
DESCRIPTION = "The official zsh completion script for catimg."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "catimg-zsh-completion-2.8.0-1.5.noarch.rpm"
RPM_HASH = "7e41f6ff736d19962297f2629968a9d6389a55e11bb17c18e3e99de7559799db81d571d8d3bf10462e1361e45e79ca2f30f1b8f7dd084a6db4ea6df6cb05bfa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "catimg-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Zsh Completion for wolfictl"
DESCRIPTION = "zsh command line completion support for wolfictl."
LICENSE = "Apache-2.0"

PV = "0.39.25"

RPM_NAME = "wolfictl-zsh-completion-0.39.25-1.1.noarch.rpm"
RPM_HASH = "3430e28604a09a434de1b4767f3c35256355b1b41751f321b58b451b68504c9344ac7d71fd8302cbb54158dd9488b16d34f4e52a750324f1991e12dde2f9e17b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wolfictl-zsh-completion"

RDEPENDS:${PN} += "wolfictl"

inherit rpm

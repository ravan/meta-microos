SUMMARY = "Bash Completion for holos"
DESCRIPTION = "Bash command line completion support for holos."
LICENSE = "Apache-2.0"

PV = "0.106.0"

RPM_NAME = "holos-bash-completion-0.106.0-1.6.noarch.rpm"
RPM_HASH = "dab04abdee0c86a752fdae593703b76a0bcf66413ffae45195d95e520d908d5210e6560013d523a0b0d3fa16bdd895eb055e204d9666f5e270b52872b7127e4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "holos-bash-completion"

RDEPENDS:${PN} += "bash-completion \
holos"

inherit rpm

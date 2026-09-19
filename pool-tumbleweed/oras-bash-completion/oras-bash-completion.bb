SUMMARY = "Bash Completion for oras"
DESCRIPTION = "Bash command line completion support for oras."
LICENSE = "Apache-2.0"

PV = "1.3.4"

RPM_NAME = "oras-bash-completion-1.3.4-1.1.noarch.rpm"
RPM_HASH = "99e18b4ecd69a3a77215751a3a4293ba3146174bb31a9080b028025eba415492a4133ce065082e60d9107eb1672636a839e17c2ff2afbc63bf824e4f1e8f6807"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oras-bash-completion"

RDEPENDS:${PN} += "bash-completion \
oras"

inherit rpm

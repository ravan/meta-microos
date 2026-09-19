SUMMARY = "Bash Completion for stgit"
DESCRIPTION = "Bash command line completion support for stgit."
LICENSE = "GPL-2.0-only"

PV = "2.6.1"

RPM_NAME = "stgit-bash-completion-2.6.1-3.3.noarch.rpm"
RPM_HASH = "99163a392366cc4f65b602acf176068e86e8708e2bc8e8ebcfff6369b69eb36eb18f74b6a4e5a9644c63668ca42c5ad5852ac507d1bc718e9aa1a5858c109ac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stgit-bash-completion"

RDEPENDS:${PN} += "bash-completion \
stgit"

inherit rpm

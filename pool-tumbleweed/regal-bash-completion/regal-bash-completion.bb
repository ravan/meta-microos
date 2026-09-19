SUMMARY = "Bash Completion for regal"
DESCRIPTION = "Bash command line completion support for regal."
LICENSE = "Apache-2.0"

PV = "0.42.0"

RPM_NAME = "regal-bash-completion-0.42.0-1.2.noarch.rpm"
RPM_HASH = "31fbe8de6715e75d17b0ba5099b6f0be6d2f59760285cb5ba3a78441de7a64c0d9890b8128f83dc5034f07a67d7002cdc0fdf0e5b6b337d8d9951e8fc742aafd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "regal-bash-completion"

RDEPENDS:${PN} += "bash-completion \
regal"

inherit rpm

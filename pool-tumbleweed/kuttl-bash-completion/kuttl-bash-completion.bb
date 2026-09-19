SUMMARY = "Bash Completion for kuttl"
DESCRIPTION = "Bash command line completion support for kuttl."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "kuttl-bash-completion-0.26.0-1.4.noarch.rpm"
RPM_HASH = "e4806c3cd29a44a58f0c4c159fd8ffa17ab19873f74fb8d8522cfa07fb2d90b673f1adcd7968cbc5c3796ad458c10fa6d4afd6404145c33064a4b5de943863ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kuttl-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kuttl"

inherit rpm

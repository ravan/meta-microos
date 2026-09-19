SUMMARY = "Bash Completion for nelm"
DESCRIPTION = "Bash command line completion support for nelm."
LICENSE = "Apache-2.0"

PV = "1.25.3"

RPM_NAME = "nelm-bash-completion-1.25.3-1.2.noarch.rpm"
RPM_HASH = "9bbfc1e105e12998562e3ff34ad60c10bdd080478cfe289223bbcd72f59e491456a6f244c41be41bb6b9061566c5be75cb3df1c591d5cbd888a49c3fa7a3b59c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nelm-bash-completion"

RDEPENDS:${PN} += "bash-completion \
nelm"

inherit rpm

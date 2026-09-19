SUMMARY = "Bash Completion for lf"
DESCRIPTION = "Bash command-line completion support for lf."
LICENSE = "MIT"

PV = "34"

RPM_NAME = "lf-bash-completion-34-1.10.noarch.rpm"
RPM_HASH = "7b52be1b20ca2686571034419b5aa0e8eef48c460efad5445be846174261d72138b3e7706368ec63cab976d4210bcc050597c71d03872b34a52148a2b8566d31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lf-bash-completion"

RDEPENDS:${PN} += "bash-completion \
lf"

inherit rpm

SUMMARY = "Bash Completion for restic"
DESCRIPTION = "Bash command line completion support for restic."
LICENSE = "BSD-2-Clause"

PV = "0.19.1"

RPM_NAME = "restic-bash-completion-0.19.1-1.2.noarch.rpm"
RPM_HASH = "dd2258906945923c3dc0e08da47890d9c2a1080d12ce83927dd7a02a95be4d3126b7e056507bae8de4429922acad60f4de8a7426fcd77ecf72201fbba46335e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "restic-bash-completion"

RDEPENDS:${PN} += "restic"

inherit rpm

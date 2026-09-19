SUMMARY = "bash completion for doggo"
DESCRIPTION = "bash completion scripts for doggo"
LICENSE = "GPL-3.0-only"

PV = "1.3.0"

RPM_NAME = "doggo-bash-completion-1.3.0-1.1.noarch.rpm"
RPM_HASH = "6bbd9d78146a4ae60c864d1c83779eb040542cae85ad4866d9a2a7e34c5dc0b4563f1fdf82a2612e99f4bfd67cdde36953747b0576def58e03889b616389ef5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "doggo-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm

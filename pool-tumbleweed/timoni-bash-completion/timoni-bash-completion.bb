SUMMARY = "Bash Completion for timoni"
DESCRIPTION = "Bash command line completion support for timoni."
LICENSE = "Apache-2.0"

PV = "0.33.0"

RPM_NAME = "timoni-bash-completion-0.33.0-1.1.noarch.rpm"
RPM_HASH = "715fec1d188a9b4547fe698be9a6c1689bf36e0bfc9b0dd809b37c5d215bc0227143b6f8bb45613e95f22966c288f3d9646712fef912e2e8681d7f25e1ffbdaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "timoni-bash-completion"

RDEPENDS:${PN} += "bash-completion \
timoni"

inherit rpm

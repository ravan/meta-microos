SUMMARY = "Bash Completion for sd"
DESCRIPTION = "Bash command-line completion support for sd."
LICENSE = "(Apache-2.0 | MIT) & (MIT | Unlicense) & BSD-3-Clause & MIT & (MIT | Unlicense)"

PV = "1.1.0"

RPM_NAME = "sd-bash-completion-1.1.0-1.4.noarch.rpm"
RPM_HASH = "fdb3cf881cf6e3ce7dffc80a066ddf61498fc13a6e1feae88954c950ab40cbfde31e7e432a66484cdbce7c9641756ba182cf5b8c292407233226381a5d6c05d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sd-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm

SUMMARY = "Bash Completion for forgejo-runner"
DESCRIPTION = "Bash command line completion support for forgejo-runner."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.0"

RPM_NAME = "forgejo-runner-bash-completion-13.1.0-1.1.noarch.rpm"
RPM_HASH = "383e8e283e1ad0349d0af1554bbb6cdb83c73f3dd475feab67722d70144727de9cd086457864f29791108cb6ed2a5bfc6860c25ee1781d2afdaea0ce51ebd984"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "forgejo-runner-bash-completion"

RDEPENDS:${PN} += "bash-completion \
forgejo-runner"

inherit rpm

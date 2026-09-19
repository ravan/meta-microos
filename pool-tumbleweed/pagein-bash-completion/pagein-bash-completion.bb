SUMMARY = "Bash Completion for pagein"
DESCRIPTION = "Bash completion script for pagein."
LICENSE = "GPL-2.0-only"

PV = "0.01.11"

RPM_NAME = "pagein-bash-completion-0.01.11-1.7.noarch.rpm"
RPM_HASH = "569e2e52158c7d127df1565784d98470aba7cf07dbb62aacf4700bc94cc5228aaafcf3135f5d82bab91269288508207edb10243b217a7d734cc1d4fbd987cbc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagein-bash-completion"

RDEPENDS:${PN} += "bash-completion \
pagein"

inherit rpm

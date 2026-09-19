SUMMARY = "Bash completion for fde-tools"
DESCRIPTION = "Bash shell completions for fde-tools"
LICENSE = "GPL-2.0-only"

PV = "0.7.7"

RPM_NAME = "fde-tools-bash-completion-0.7.7-1.1.noarch.rpm"
RPM_HASH = "86b5737836fafa1ba991ec6bff92a1b6d506cf42a82fe094a82dd11e8aff7be13f9308f92434e5ccd514a02119bcbd18b9c29fee1e590f3569356e3f7a2c46c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fde-tools-bash-completion"

RDEPENDS:${PN} += "bash-completion \
fde-tools"

inherit rpm

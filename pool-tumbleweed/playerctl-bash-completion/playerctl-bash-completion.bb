SUMMARY = "Bash completion for playerctl"
DESCRIPTION = "Bash command line completion support for playerctl."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "playerctl-bash-completion-2.4.1-1.21.noarch.rpm"
RPM_HASH = "82d9ed12c3ea7c68108b1b58274c6ee6deb75ad1be4e2f43bd497e65f5b880125ec7641b73d82fac5d222e13fa1b037c441ce97d76096120ad7dc5a8ba5da7d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "playerctl-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm

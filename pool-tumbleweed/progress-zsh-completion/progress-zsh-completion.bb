SUMMARY = "ZSH Completion for progress"
DESCRIPTION = "ZSH command line completion support for progress."
LICENSE = "GPL-3.0-or-later"

PV = "0.17"

RPM_NAME = "progress-zsh-completion-0.17-1.11.noarch.rpm"
RPM_HASH = "94024c7ce2cd6ae3bd3099a828b1ee24380eadb6f32d16a047a92784651fb3a4665b3848b9e8d2ae1f8e1449e7f1f62626f8e5a63d948a8b9ba9a70a155ef368"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "progress-zsh-completion"

RDEPENDS:${PN} += "progress"

inherit rpm

SUMMARY = "Bash Completion for awww"
DESCRIPTION = "Bash command-line completion support for awww."
LICENSE = "GPL-3.0-only"

PV = "0.12.0"

RPM_NAME = "awww-bash-completion-0.12.0-1.5.noarch.rpm"
RPM_HASH = "620294e8d5a4c99d82b74f57ad965e55fe33e382e44274a8c6e2abd4c7823c8d31dc8bdfee48fd6abc62bfc6c5811c8a69d30c5f511e358bc3adf61ed249ab8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "awww-bash-completion \
swww-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm

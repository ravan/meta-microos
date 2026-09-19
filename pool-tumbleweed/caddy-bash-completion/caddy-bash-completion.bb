SUMMARY = "Bash Completion for caddy"
DESCRIPTION = "Bash completion script for caddy, generated during the build."
LICENSE = "Apache-2.0"

PV = "2.11.4"

RPM_NAME = "caddy-bash-completion-2.11.4-1.3.noarch.rpm"
RPM_HASH = "7ef3f1ab21d79bdca670b6f8f71e8f6825e22f2aa3d1434a737ceca1522bc624f8c16633bea01faa29398157029d549139e7ffe5113b634e638ed180a8d2868c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caddy-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm

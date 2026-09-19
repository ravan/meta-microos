SUMMARY = "Bash Completion for mesheryctl"
DESCRIPTION = "Bash command line completion support for mesheryctl."
LICENSE = "Apache-2.0"

PV = "1.0.65"

RPM_NAME = "mesheryctl-bash-completion-1.0.65-1.1.noarch.rpm"
RPM_HASH = "02ae6874d587a96aab3d62ea4fdc7c91114b1afbdf61c8a50977793a65d3117d23cf71c67ded19251c132a38a8bed1971a4e0b5192407f2fc43354a5e44ff9be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mesheryctl-bash-completion"

RDEPENDS:${PN} += "bash-completion \
mesheryctl"

inherit rpm
